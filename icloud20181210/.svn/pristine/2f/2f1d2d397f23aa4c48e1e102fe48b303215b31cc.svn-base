var Drag={
    "obj":null,
	"init":function(handle, dragBody, e){
		if (e == null) {
			handle.onmousedown=Drag.start;
		}
		handle.root = dragBody;
		
		if(isNaN(parseInt(handle.root.style.left)))handle.root.style.left="0px";
		if(isNaN(parseInt(handle.root.style.top)))handle.root.style.top="0px";//その後top値を取得できる確保
		handle.root.onDragStart=new Function();
		handle.root.onDragEnd=new Function();
		handle.root.onDrag=new Function();
		if (e !=null) {
			var handle=Drag.obj=handle;
			e=Drag.fixe(e);
			var top=parseInt(handle.root.style.top);
			var left=parseInt(handle.root.style.left);
			handle.root.onDragStart(left,top,e.pageX,e.pageY);
			handle.lastMouseX=e.pageX;
			handle.lastMouseY=e.pageY;
			document.onmousemove=Drag.drag;
			document.onmouseup=Drag.end;
		}
	},
	"start":function(e){
		var handle=Drag.obj=this;
		e=Drag.fixEvent(e);
		var top=parseInt(handle.root.style.top);
		var left=parseInt(handle.root.style.left);
		//alert(left)
		//　日常具合　left top　の　初めて値　は　
		handle.root.onDragStart(left,top,e.pageX,e.pageY);
		handle.lastMouseX=e.pageX;
		handle.lastMouseY=e.pageY;
		document.onmousemove=Drag.drag;
		document.onmouseup=Drag.end;
		return false;
	},	
	"drag":function(e){//ここの　this　は　document それで　Drag.obj　に　ドラッグのオブジェクト　を　保存するだけ只能保存在Drag.obj里
		e=Drag.fixEvent(e);
		var handle=Drag.obj;
		var mouseY=e.pageY;
		var mouseX=e.pageX;
		var top=parseInt(handle.root.style.top);
		var left=parseInt(handle.root.style.left);//ここのtopとleftはhandle.root距離ブラウザ枠の上から離れてと左
		
		var currentLeft,currentTop;
		currentLeft=left+mouseX-handle.lastMouseX;
		currentTop=top+(mouseY-handle.lastMouseY);
		
		//一瞬の上に加えてマウスから二つの瞬間移動距離を離れて今の上
		
		handle.root.style.left=currentLeft +"px";
		handle.root.style.top=currentTop+"px";
		
		//　目前の位置を更新する
		
		handle.lastMouseX=mouseX;
		handle.lastMouseY=mouseY;
		
		//　次の度　計算変位に　この瞬く間のマウスの値を保存する　
		handle.root.onDrag(currentLeft,currentTop,e.pageX,e.pageY);//呼び出し外対応の関数
		return false;
	},
	"end":function(){
		document.onmousemove=null;
		document.onmouseup=null;
		Drag.obj.root.onDragEnd(parseInt(Drag.obj.root.style.left),parseInt(Drag.obj.root.style.top));
		Drag.obj=null;
	},
	"fixEvent":function(e){//イベントの変数オブジェクトをフォーマットする
		if(typeof e=="undefined")e=window.event;
		if(typeof e.layerX=="undefined")e.layerX=e.offsetX;
		if(typeof e.layerY=="undefined")e.layerY=e.offsetY;
		if(typeof e.pageX == "undefined")e.pageX = e.clientX + document.body.scrollLeft - document.body.clientLeft;
		if(typeof e.pageY == "undefined")e.pageY = e.clientY + document.body.scrollTop - document.body.clientTop;
		return e;
	}
};

//------------------------Utility------------------------
function findPosX(obj) {//補助関数 　エレメント左側　と　ブラウザの左側　間に　の　距離　を得る

    var curleft = 0;
    if (obj && obj.offsetParent) {
        while (obj.offsetParent) {
            curleft += obj.offsetLeft;
            obj = obj.offsetParent;
        }
    } else if (obj && obj.x) curleft += obj.x;
    return curleft; // + document.body.scrollLeft - document.body.clientLeft;
}

function findPosY(obj) {//補助関数 　エレメント上　と　ブラウザの上　間に　の　距離　を得る
    var curtop = 0;
    if (obj && obj.offsetParent) {
        while (obj.offsetParent) {
            curtop += obj.offsetTop;
            obj = obj.offsetParent;
        }
    } else if (obj && obj.y) curtop += obj.y;
    return curtop; // + document.body.scrollTop - document.body.clientTop;
}


var dragGhost = document.createElement("div");
dragGhost.style.border = "dashed 1px #CCCCCC";
dragGhost.style.background = "white";
dragGhost.style.display = "none";
dragGhost.style.margin = "10px";

var container;
var columns = [];
//------------------------Start Here------------------------
window.onload = function() {
    container = document.getElementById("container");

    for (var i = 0; i < container.childNodes.length; i++) {
        if (container.childNodes[i].className == "column") {//所有の列を篩い分ける　ff下のchildNodes　信用できない:\
            columns.push(container.childNodes[i]);
        }
    }
    for (var i = 0; i < columns.length; i++) {
        var column = columns[i];
        for (var j = 0; j < column.childNodes.length; j++) {
            var item = column.childNodes[j];
            if (item.className == "item") {
                item.column = column; //给每个拖拽对象要指明它属于哪一列 而且这个属性会随着拖动而更新的				
                new dragItem(item);
            }
        }
    }
}
var isIE = document.all;

//------------------------Drag Item------------------------
function dragItem(item) {
    //item　実際はdragBody(　拖动的时候移动的整体)
    //ここによって必要item見つけhandle（がドラッグの取っ手）

    var handle;
    for (var i = 0; i < item.childNodes.length; i++) {
        if (item.childNodes[i].nodeName.toLowerCase() == "div") {
            handle = item.childNodes[i];
            break;
        }
    }
    if (!handle) return;
    Drag.init(handle, item);
    item.onDragStart = function(left, top, mouseX, mouseY) {
//　　開始　引きする　とき　透明度を設定します
        this.style.opacity = "0.5";
        this.style.filter = "alpha(opacity=50)";
        dragGhost.style.height = isIE ? this.offsetHeight + "px" : (this.offsetHeight - 2) + "px";

        //this　は　item

        this.style.width = this.offsetWidth + "px"; //初期のwidthはauto　から
        this.style.left = findPosX(this) - 5 + "px";
        this.style.top = findPosY(this) - 5 + "px";
        this.style.position = "absolute";

        //　目前の位置へ　ghostを挿入する
        dragGhost.style.display = "block";
        this.column.insertBefore(dragGhost, this);

        //记录每一列的左边距 在拖动过程中判断拖动对象所在的列会用到
        this.columnsX = [];
        for (var i = 0; i < columns.length; i++) {
            this.columnsX.push(findPosX(columns[i]));
        }

    }
    item.onDrag = function(left, top, mouseX, mouseY) {

        //先要判断在哪一列移动
        var columnIndex = 0;

        for (var i = 0; i < this.columnsX.length; i++) {
            if ((left + this.offsetWidth / 2) > this.columnsX[i]) {
                columnIndex = i;
            }
        }
        //如果columnIndex在循环中没有被赋值 则表示当前拖动对象在第一列的左边
        //此时也把它放到第一列

        var column = columns[columnIndex];

        if (this.column != column) {
            //之前拖动对象不在这个列　以前のドラッグ　オブジェクト　不在　この列 
            //最下の位置へ　ghostを挿入する

            column.appendChild(dragGhost);
            this.column = column;
        }

//そして　　この列のどんな位置　を判断する
        var currentNode = null;
        for (var i = 0; i < this.column.childNodes.length; i++) {
            if (this.column.childNodes[i].className == "item"
			&& this.column.childNodes[i] != this//不能跟拖动元素自己比较 否则不能在本列向下移动
			&& top < findPosY(this.column.childNodes[i])) {//从上到下找到第一个比拖动元素的上边距大的元素

                currentNode = this.column.childNodes[i];
                break;
            }
        }
        if (currentNode)
            this.column.insertBefore(dragGhost, currentNode);
        else//拖到最下边 没有任何一个元素的上边距比拖动元素的top大 则添加到列的最后

            this.column.appendChild(dragGhost);
    }
    item.onDragEnd = function(left, top, mouseX, mouseY) {
        this.style.opacity = "1";
        this.style.filter = "alpha(opacity=100)";

        this.column.insertBefore(this, dragGhost);

        this.style.position = "static";
        this.style.display = "block";
        this.style.width = "auto";
        dragGhost.style.display = "none";
        Move();
    }
}


function Move() {
    var columns2 = [];
    var left = "";
    var right = "";
    container = document.getElementById("container");
    for (var i = 0; i < container.childNodes.length; i++) {
        if (container.childNodes[i].className == "column") {//所有の列を篩い分ける　ff下のchildNodes　信用できない:\
            columns2.push(container.childNodes[i]);
        }
    }
    for (var i = 0; i < columns2.length; i++) {
        var column = columns2[i];
        for (var j = 0; j < column.childNodes.length; j++) {
            var item = column.childNodes[j];
            if (item.className == "item") {
                item.column = column; //给每个拖拽对象要指明它属于哪一列 而且这个属性会随着拖动而更新的
                //alert(column.id+"|"+item.id);
                if (i == 0) {
                    left += item.id + ';';
                } else {
                    right += item.id + ';';
                }
            }
        }

    }

    var order = left + '|' + right;
    jQuery.post('WidSeting.aspx', "<?xml version='1.0' encoding='utf-8'?><root><type>Move</type><order>" + order + "</order></root>", function(s) {
        var status = jQuery("status", s).text();
        if (status == "err") {
            alert(jQuery("body", s).text());
        }
    });
}

function addwidget(widgetname, prosion) {
    jQuery.post('WidSeting.aspx', "<?xml version='1.0' encoding='utf-8'?><root><type>ADD</type><widgetname>" + widgetname + "</widgetname><prosion>" + prosion + "</prosion></root>", function(s) {
        var status = jQuery("status", s).text();
        if (status == "err") {
            alert(jQuery("body", s).text());
        } else {
            window.location.reload();
        }
    });
}

function removeWidget(widgetid, evt) {
    var e = (evt) ? evt : window.event;
    if (window.event) {
        e.cancelBubble = true;
    } else {
        e.stopPropagation();
    }
    if (!confirm('\u4F60\u786E\u5B9A\u8981\u5220\u9664\u5417?')) { return false; }
    jQuery.post('WidSeting.aspx', "<?xml version='1.0' encoding='utf-8'?><root><type>removeWidget</type><widgetid>" + widgetid + "</widgetid></root>", function(s) {
        var status = jQuery("status", s).text();
        if (status == "err") {
            alert(jQuery("body", s).text());
        } else {
           window.location.href = "MyWorktable.aspx";
        }
    });
}

function hideWidget(obj, widgetid, evt) {
    jQuery.post('WidSeting.aspx', "<?xml version='1.0' encoding='utf-8'?><root><type>hideWidget</type><widgetid>" + widgetid + "</widgetid></root>", function(s) {
        var status = jQuery("status", s).text();
        if (status == "err") {
            alert(jQuery("body", s).text());
        } else {
            var newobj = jQuery(obj).parent().parent();
            jQuery(newobj).find("div[class='content']").hide();
            jQuery(obj).parent().find("a[class='widget_show']").replaceWith("<a class=\"widget_show\" href=\"javascript:\" onMouseDown=\"javascript:showWidget(this,'" + widgetid + "',event);\" title=\"\u8FD8\u539F\">\u8FD8\u539F</a>");
        }
    });
    var e = (evt) ? evt : window.event;
    if (window.event) {
        e.cancelBubble = true;
    } else {
        e.stopPropagation();
    }
}

function showWidget(obj, widgetid, evt) {
    jQuery.post('WidSeting.aspx', "<?xml version='1.0' encoding='utf-8'?><root><type>showWidget</type><widgetid>" + widgetid + "</widgetid></root>", function(s) {
        var status = jQuery("status", s).text();
        if (status == "err") {
            alert(jQuery("body", s).text());
        } else {
            var newobj = jQuery(obj).parent().parent();
            jQuery(newobj).find("div[class='content']").show();
            jQuery(obj).parent().find("a[class='widget_show']").replaceWith("<a class=\"widget_show\" href=\"javascript:\" onMouseDown=\"javascript:hideWidget(this,'" + widgetid + "',event);\" title=\"\u6700\u5C0F\u5316\">\u6700\u5C0F\u5316</a>");
        }
    });
    var e = (evt) ? evt : window.event;
    if (window.event) {
        e.cancelBubble = true;
    } else {
        e.stopPropagation();
    }
}

function editWidget(widgetid, evt) {
    location.href = 'WidgetEdit.aspx?widgetid=' + widgetid;
    var e = (evt) ? evt : window.event;
    if (window.event) {
        e.cancelBubble = true;
    } else {
        e.stopPropagation();
    }
}

function donothing(evt) {
    var e = (evt) ? evt : window.event;
    if (window.event) {
        e.cancelBubble = true;
    } else {
        e.stopPropagation();
    }
}