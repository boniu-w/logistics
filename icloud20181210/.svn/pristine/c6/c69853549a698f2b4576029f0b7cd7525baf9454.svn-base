/*
*タブを新規作成：PE_FrameTab.AddNew(url)
*カレントのタブを閉じる：PE_FrameTab.CloseCurrentTab()
* レントのタブ切り替ベットタブ時触発BeforeSwitch()、関数が存在　その戻りfalse　タブを切り替えるません．関数を書くにカレントのページちょくせつ。
*ベットタブ切り替カレントのタブの時触発SwitchInto()、関数が存在　実行する。関数を書くに切り替のページちょくせつ。
*　カレントのタブを閉じる時触発OnCloseTab()、関数が存在　実行する。関数を書くカレントのページちょくせつ．
*/
var lastFrameTabId = 1; //きいしゆう　新規FrameTabIdに新規FrameTabId、
var currentFrameTabId = 1; //カレントのFrameTab
var frameTabCount = 1;

var PE_FrameTab = {
    //タブを新規作成
    AddNew: function(url) {
        NewFrameTab(url);
    },
    //カレントのタブを閉じる
    CloseCurrentTab: function() {
        jQuery("#iFrameTab" + currentFrameTabId).find(".closeTab").click();
    }
};

///tabを登記た．切り替えると　tabイベントを閉じる
jQuery.fn.iFrameTab = function() {
    jQuery(this).each(function() {
        var cr = jQuery(this);
        var tabId = cr.attr("id").replace("iFrameTab", "");
        cr.click(function() {// FrameTabを切り替える
            SwitchIframe(this);
        }).find(".closeTab").click(function() {// FrameTabを閉じる
            if (frameTabCount > 1) {
                var mainRightFrame = jQuery("#main_right_frame iframe[tabid='" + tabId + "']");
                var bClose = mainRightFrame[0].contentWindow.OnCloseTab ? mainRightFrame[0].contentWindow.OnCloseTab() : true;
                if (bClose) {
                    if (cr.attr("class") == "current") {//カレントのタブを閉じたら、前のタブを切り替える。前のタブがあった,後のタブを切り替える。
                        var nextIframe = cr.prev("li[id^='iFrameTab']");
                        if (nextIframe.length <= 0) { nextIframe = cr.next("li[id^='iFrameTab']"); }
                        SwitchIframe(nextIframe[0]);
                    }
                    //取り除く
                    cr.remove();
                    jQuery("#frmTitle iframe[tabid='" + tabId + "']").remove();
                    mainRightFrame.remove();
                    frameTabCount--;
                    CheckFramesScroll();
                }
            }
        }).end().dblclick(function() {
            jQuery(this).find(".closeTab").click();
        });
    });
    return jQuery(this);
}

//tabを切り替える
function SwitchIframe(iFrameTab, url) {
    var tabId = jQuery(iFrameTab).attr("id").replace("iFrameTab", "");  //マウスクリックtabのid
    if (currentFrameTabId == tabId) { return false; }
    //判断きょようTabを切り替える否や
    var switchFunc = jQuery("#main_right")[0].contentWindow.window.BeforeSwitch;
    var bSwitch = (switchFunc) ? switchFunc() : true;
    if (!bSwitch) { return false; }

    var currentGuideSrc = jQuery("#frmTitle iframe[tabid='" + currentFrameTabId + "']").attr("src");
    SetCurrentFrameTab(iFrameTab);
    var guideFrames = jQuery("#frmTitle > iframe").hide().attr({ "id": "", "name": "" });
	var mainFrames = jQuery("#main_right_frame > iframe").hide().attr({ "id": "", "name": "" });
	var newGuideFrame = jQuery("#frmTitle iframe[tabid='" + tabId + "']");
	var newMainFrame = jQuery("#main_right_frame iframe[tabid='" + tabId + "']");
    //iframeのwindow.name空ろを設定する, <a target="main_right" />有効カレントのiframeだけ
    mainFrames.each(function() { this.contentWindow.window.name = ""; }); 
    guideFrames.each(function() { this.contentWindow.window.name = ""; });
    if (newGuideFrame.length <= 0) {
        newGuideFrame = jQuery("#frmTitle").append(jQuery("#iframeGuideTemplate").html())
				.find("[tabid=0]").attr({ "tabid": tabId, "src": currentGuideSrc || "about:blank", "id": "left", "name": "left" })
				.css("display", "block");
    } else {
        newGuideFrame = jQuery("#frmTitle iframe[tabid='" + tabId + "']")
            .attr("id", "left").attr("name", "left").show();
    }
    newGuideFrame[0].contentWindow.window.name = "left";
    frames["left"] = newGuideFrame[0].contentWindow.window;
    if (newMainFrame.length <= 0) {//新建タブ否や
        newMainFrame = jQuery("#main_right_frame").prepend(jQuery("#iframeMainTemplate").html())
				.find("[tabid=0]").attr({ "tabid": tabId, "src": (url || "about:blank"), "id": "main_right", "name": "main_right" })
				.css("display", "block");
    } else {
        newMainFrame = jQuery("#main_right_frame iframe[tabid='" + tabId + "']")
            .attr("id", "main_right").attr("name", "main_right").show();
    }
   //指定iframeのwindow.name、使う<a target="main_right" />ゆうこう
    newMainFrame[0].contentWindow.window.name = "main_right";
    frames["main_right"] = newMainFrame[0].contentWindow.window;

    currentFrameTabId = tabId;
    resizeFrame();

    var switchInto = jQuery("#main_right")[0].contentWindow.window.SwitchInto;
    if(switchInto){ switchInto(); }
}

//しょきか新建
function InitNewFrameTab() {
    jQuery("#newFrameTab").click(function() {
        NewFrameTab();
    });
}
//タブを新規作成
function NewFrameTab(url) {
    var newFrameTab = jQuery("#newFrameTab");
    //jQuery("#FrameTabs .current").removeClass("current");
    jQuery('<li id="iFrameTab' + (++lastFrameTabId) + '" ><a href="javascript:"><span id="frameTabTitle">(標題が有りません)</span><a class="closeTab"><img border="0" src="' + StyleSheetPath + 'images/tab-close.gif"/></a></a></li>')
				.insertBefore(newFrameTab).iFrameTab();
    frameTabCount++;
    SwitchIframe(jQuery("#iFrameTab" + lastFrameTabId)[0], url);
    if (CheckFramesScroll()) { jQuery("#FrameTabs ul:eq(0)").css("margin-left", cW - fW - 40); }
}

function SetCurrentFrameTab(selector) {
    jQuery("#FrameTabs .current").removeClass("current");
    jQuery(selector).addClass("current");
}
// チェックスクロールが要ります否や
function CheckFramesScroll() {
    var ft = jQuery("#FrameTabs");
    window.cW = ft.width(); //包含Tabs的容器宽度　インクルードTabsの入れ物広さ
    window.fW = ft.find("ul:eq(0)").width();
    ft.unbind("DOMMouseScroll").unbind("mousewheel");
    if (fW > cW) {
        if (jQuery.browser.mozilla) {
            ft.bind("DOMMouseScroll", function(e) {
                ScrollFrames(cW, fW, e);
            });
        } else {
            ft.bind("mousewheel", function(e) {
                ScrollFrames(cW, fW, e);
            });
        }
        jQuery("#FrameTabs .tab-strip-wrap").addClass("tab-strip-margin");
        jQuery("#FrameTabs .tab-right, #FrameTabs .tab-left").css("display", "block");
        return true;
    } else {
        jQuery("#FrameTabs ul:eq(0)").css("margin-left", 0);
        jQuery("#FrameTabs .tab-right, #FrameTabs .tab-left").css("display", "none");
        jQuery("#FrameTabs .tab-strip-wrap").removeClass("tab-strip-margin");
        return false;
    }
}
// Tabスクロール
//cWはインクルードTabsの入れ物広さです、fWはぜんぶTabsの広さです、yは指定の変位、y指定ないたら、使用eventに中の変位
function ScrollFrames(cW, fW, event, y) {
    if (!y) {
        if (event.wheelDelta) {
            y = event.wheelDelta / 5;
        } else if (event.detail) {
            y = -event.detail * 8;
        }
    }
    var jList = jQuery("#FrameTabs ul:eq(0)");
    var ml = jList.css("margin-left");
    ml = Number(ml.toLowerCase().replace("px", ""));
    if ((ml < 0 && y > 0) || (ml - cW > -fW - 40) && y < 0) {
        ml = ml + y;
        if (ml >= 0) { ml = 0; }
        if (ml - cW <= -fW - 40) { ml = cW - fW - 40;}
        jList.css("margin-left", ml);
    }
}
//Tabを登録、範囲を超過する時、左変位と右変位事件
function RegScrollFramesBtn() {
    jQuery("#FrameTabs .tab-right").click(function() { 
        ScrollFrames(window.cW,window.fW,null,-50);
    });
    jQuery("#FrameTabs .tab-left").click(function() { 
        ScrollFrames(window.cW,window.fW,null,50);
    });
}

//タグの標題をセットする
//tarFrameは目標tarFrameです。
function SetTabTitle(tarFrame) {
    var title = "";
    try { title = tarFrame.contentWindow.document.title; } catch (e) { }
    var subTitle = title = title || "(標題が有りません)";
    if (title.length > 6) { subTitle = title.substr(0, 5) + ".." }
    jQuery("#iFrameTab" + jQuery(tarFrame).attr("tabid")).find("#frameTabTitle").html(subTitle).attr("title", title);
}

function resizeFrame() {
    var width = document.body.clientWidth - 207;
    var lHeight = document.body.clientHeight - 78;
    var rHeight = lHeight - (jQuery("#FrameTabs").height() || 0) ;
    document.getElementById("main_right").style.width = width > 0 ? width : 0;
    document.getElementById("main_right").style.height = rHeight > 0 ? rHeight : 0;
    document.getElementById("left").style.height = lHeight > 0 ? lHeight : 0;
    jQuery("#FrameTabs").width(width);
}

jQuery(function() {
    jQuery("#FrameTabs li[id^='iFrameTab']").iFrameTab();
    InitNewFrameTab(); //しょきか新建タグのページ
    RegScrollFramesBtn();
});
