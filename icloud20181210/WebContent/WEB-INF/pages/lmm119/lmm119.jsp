<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  
  <meta charset="UTF-8">
  <title> トラッキングG別イベント一覧 </title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/paging.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/messages_cn.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/commons-vacation.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/paging.js"></script>
<script type="text/javascript">

  /* ページローディング時にローディングする */
  $(function(){
	
    /* 検索範囲の初期値の設定処理 */ 
    var searchZone_Rdos = $("input[name='searchZone_Rdo']");
    
    /* 初期化処理デフォルト選択のradio*/
    $.each(searchZone_Rdos,function(i, e) {
        var value = $(e).attr("value");
        if(value == "0"){ 
            $(e).attr("checked","true");
        }
    });
    
    /* ページを更新して戻ってきたか否かを判断した場合 */
    if ( searchZone_Rdos != null && searchZone_Rdos != "" ) {
    
         /* 更新ボタン押下前のラジオラジオradio */
         $.each(searchZone_Rdos,function(i, e) {
              var value = $(e).attr("value");
              
              /* デフォルト選択の状態を削除する */
              if(value == "0"){ 
                  $(e).attr("checked","fasle");
              }
              
              /* スクープ更新画面前のラジオを表示する */ 
              if(value == "${searchZone_Rdo}"){ 
                  $(e).attr("checked","true");
              }
              
          });
          
          /* 更新後に表示に戻る更新フリップ前のページ表示を行う */
          $("#tntcod").val("${tntcod}");
          $("#trkgrpcod").val("${trkgrpcod}");
          $("#trkgrpnam").val("${trkgrpnam}");
          $("#apporgcod").val("${apporgcod}");
    }
      
    /* ページ更新してカーソルが自動的に最初のinputにフォーカスを合わせます */
    $(document).ready(function(){$('input[type=text]:first').focus();});
     
  })
  
  /* パラメータを表すコードをする */
  var judgeNum = 0;
  
  /* 検索 */
  function selectDate(){
    
     var tntcod     = $("#tntcod").val();               //PKロジックinを入れて、EL表达式取得
     var trkgrpcod 	= $("#trkgrpcod").val();            //PK ページ取得
     var trkgrpnam 	= $("#trkgrpnam").val();            //ページ取得
     var apporgcod 	= $("#apporgcod").val();            //ページ取得
     
     /* radio ラジオの最終選択ページを取得します  */
     var aboflg     = $("input[name='searchZone_Rdo']:checked").val();
     
     /* しょき ステータス */
     var allowState = false;
      
     /* 入力項目のコンテンツ長を取得する */
     var apporgcod1 = document.getElementById('apporgcod').value.length;
     
     /* 入力項目のコンテンツ長を取得する */
     var trkgrpcod1 = document.getElementById('trkgrpcod').value.length;
     
     var trkgrpnam1 = document.getElementById('trkgrpnam').value.length;
     
     /* 入力内容は正則に定められた範囲に合致しなければならない。
           必要なのは数字と大文字そして小文字です
           他はすべて規範に合わない */
     var regular = '/^[0-9a-zA-Z]$/';
     
     /* 初期トークン */
     var judgeNum1=0;
     var judgeNum2=0;
     var judgeNum3=0;
     var judgeNum4=0;
     var judgeNum5=0;
     /* 不符合入力条件条件 */
     if( apporgcod.match( regular ) == null ){
         judgeNum1 = 1;
     }
    /* 入力条件に合わない */
    if( trkgrpcod.match(regular) == null ){
         judgeNum2 = 2;
    }
    /* 長さが違法かどうかを判断する */
    if ( apporgcod1>12 ) {
         judgeNum3 = 3;
     }
     /* 長さが違法かどうかを判断する */
     if ( trkgrpcod1>12 ) {
         judgeNum4 = 4;
     }
     /* 長さが違法かどうかを判断する */
     if (trkgrpnam1>50) {
        judgeNum5 = 5;
     }
     judgeNum = judgeNum1+"/"+judgeNum2+"/"+judgeNum3+"/"+judgeNum4+"/"+judgeNum5;
     $.post("../lmm119Controller/trkgrpnamRegularTest",   
                {
                    judgeNum:judgeNum
                 },
                  function(data){
                    /* トークンはすべて正常に、修正しょき ステータス */
                    if ( data == 200 ){
                       allowState = true;
                    }
                    },"json");
    
      if ( allowState == true ){
          
          var lMMMTRKG_List = " ";                        //拼接表
          $.post("../lmm119Controller/selectDate",   
                        {
                            tntcod:tntcod,
                            trkgrpcod:trkgrpcod,
                            trkgrpnam:trkgrpnam,
                            apporgcod:apporgcod,
                            aboflg:aboflg
                            },
                            function(data){
                            
                            /* 一覧画面の一覧構造をつなぎます */
                            for ( var i = 0; i < data.length; i++ ) {
                                
                                lMMMTRKG_List +=
                                
                                "<tr>"+
                                    "<td style='border:1px solid #000000'><input type='radio' id='r1"+ i +"' name='userUacc' value="+ i +"></input></td>"+
                                    "<td style='border:1px solid #000000'><input type='text'	 value="+ data[i].aboflg +"></input></td>"+
                                    "<td style='border:1px solid #000000'><input  id='o"+ i +"' maxlength = '35' value="+ data[i].orgnam1 +"></input></td>"+
                                    "<td style='border:1px solid #000000'><input  id='d"+ i +"' maxlength = '12' value="+ data[i].trkgrpcod +"></input></td>"+
                                    "<td style='border:1px solid #000000'><input  id='m"+ i +"' maxlength = '50' value="+ data[i].trkgrpnam +"></input></td>"+
                                    "<td style='border:1px solid #000000'><input  id='u"+ i +"' maxlength = '3' value="+ data[i].updeac +"></input></td>"+
                                "</tr>"
                                
                                $("#org_List").html(lMMMTRKG_List);
                                
                                /* リストの第1選択を表示する */
                                $('#r10').attr('checked', 'checked');
                            }
                                
                            },"json");
       
      }
     
  }
  
  /* 変更 */
  function updateData(){
    
    /* 選ばれたのを獲得するradio */
    var addressID   =    $("input[name='userUacc']:checked").val();
    var tntcod      =    $("#tntcod").val();                    //PK EL表达式取得
    var trkgrpcod   =    $('#o'+ addressID +'').val();          //PK トラッキングＧコード
    var trkgrpnam   =    $("#trkgrpnam").val();                 //ページ取得
    var apporgcod   =    $("#apporgcod").val();                 //ページ取得
    
    /* リストが表示されない限り選択する */
    if( addressID == undefined ){
        
        $.post("../lmm119Controller/radioIsUnchecked",   
                null,
                function(data){},"json");
        }
    
    
    /* ページ送信値 */
    //location.href="../lmm120Controller/init?modflg=1";
  }
  
  /* 引用 */
  function reference(){
    
    /* 選ばれたのを獲得するradio */
    var dynamicRadioID = $( "input[ name = 'userUacc' ]:checked" ).val();
    
    /* リストが表示されない限り選択する */
    if( dynamicRadioID == undefined ){
        
        $.post("../lmm119Controller/radioIsUnchecked",   
                null,
                function(data){
            },"json");
        }
    
    /* このようにして得られた兄弟ノードのコンテンツをinputに格納します
             「新规」をクリックしたときに隠されたinputのコンテンツを取得して反復データを導入する */
     /* 動的idを形成する。 */
    $( "#dynamicID" ).val( dynamicRadioID );
  }
  
  /* 新规 */
  function addData(){
    
    /* 選ばれたのを獲得するradio */
    var addressID   =   $( "input[ name = 'userUacc' ]:checked" ).val();
    
    /* 隠しinputのコンテンツを取得します */
    var dynamicID   =   $( '#dynamicID' ).val();
    
    /* スティッチング動的idから導入コンテンツを取得する */
    var orgnam1     =   $( ' #o ' + addressID + ' ' ).val();
    var trkgrpcod   =   $( ' #d ' + addressID + ' ' ).val();
    var trkgrpnam   =   $( ' #m ' + addressID + ' ' ).val();
    var updeac      =   $( ' #u ' + addressID + ' ' ).val();
    
    /* ページ送信値 */
    //location.href="../lmm120Controller/init?modflg=0";
  }
  
  /* 申請組織コード	正則検証 */
  function apporgcodRegularTest( v ) {
    
    /* 入力内容は正則に定められた範囲に合致しなければならない。
           必要なのは数字と大文字そして小文字です
           他はすべて規範に合わない */
    var regular = '/^[0-9a-zA-Z]$/';
    
     /* 不符合入力条件条件 */
    if( v.match( regular ) == null ){
        
        /* 項目はコードを表す */
        judgeNum = 1;
        
        $.post("../lmm119Controller/trkgrpnamRegularTest",   
                {
                    judgeNum:judgeNum
                },
                function(data){},"json");
         
        }
    
     /* 入力項目のコンテンツ長を取得する */
      var apporgcod = document.getElementById('apporgcod').value.length;
     
     /* 長さが違法かどうかを判断する */
     if ( apporgcod>12 ) {
         judgeNum = 3;
         $.post("../lmm119Controller/trkgrpnamRegularTest",   
                   {
                        judgeNum:judgeNum
                    },
                    function(data){},"json");
      }
    
  }
  
  /* トラッキングＧコード  正則検証 */
  function trkgrpcodRegularTest( v ) {
      
     /* 入力内容は正則に定められた範囲に合致しなければならない。
           必要なのは数字と大文字そして小文字です
           他はすべて規範に合わない */
     var regular = '/^[0-9a-zA-Z]$/';
        /* 入力条件に合わない */
        if( v.match(regular) == null ){
            
            /* 項目はコードを表す */
            judgeNum = 2;
            
            $.post("../lmm119Controller/trkgrpnamRegularTest",   
                    {
                        judgeNum:judgeNum
                    },
                    function(data){},"json");
       }
        
         /* 入力項目のコンテンツ長を取得する */
         var trkgrpcod = document.getElementById('trkgrpcod').value.length;
         
         /* 長さが違法かどうかを判断する */
         if ( trkgrpcod>12 ) {
             judgeNum = 4;
             $.post("../lmm119Controller/trkgrpnamRegularTest",   
                        {
                            judgeNum:judgeNum
                        },
                        function(data){},"json");
         }
  }
  
  /* トラッキングＧ名称 動的message検出、入力長さ超長テスト */
  function trkgrpnamRegularTest() {
      
      /* 項目はコードを表す */
      judgeNum = 5;
      
      /* 入力項目のコンテンツ長を取得する */
      var trkgrpnam = document.getElementById('trkgrpnam').value.length;
      
      /* 長さが違法かどうかを判断する */
      if (trkgrpnam>50) {
           $.post("../lmm119Controller/trkgrpnamRegularTest",   
                    {
                         judgeNum:judgeNum
                    },
                    function(data){},"json");
      }
  }
  
  </script>
  <style>
  
  /* inputは外枠を除く */
  input {
        border: 0; 
        outline: none;
        background-color: rgba(0, 0, 0, 0);
  }
  </style>
  
 </head>
 <body>
    <input hidden = "hidden" id = "dynamicID" value=""/>
  <form action = "quallBy" method = "post" id = "newform">
   <table class = "header_area">
      <tr>
        <td colspan = "2">
            <table class = "header_area">
               <tr>
                  <td><jsp:include page ="header.jsp" flush = "true" /></td>
               </tr>
            </table>
        </td>
     </tr>
      <tr>
        <td>
          <table class = "menu">
              <tr>
                <td class = "menu">
                   <jsp:include page ="menu.jsp" flush = "true" />
                </td>
              </tr>
          </table>
        </td>
        <td>
          <table class = "main">
            <tr>
               <td class = "main">
                  <table class = "data_table">
                     <tr>
                        <td>
                        <div style = " border:1px solid #000;
                        width:150px; height:25px; position:relative; left:21px; top:24.5px; ">
                                                             検索範囲
                        </div>
                         <div style = " border:1px solid #000; position:relative; left:170px; width:660px ; ">
                            <input type ="radio" id = "radio1" value="1" name = "searchZone_Rdo" />全件
                            <input type ="radio" id = "radio2" value="0" name = "searchZone_Rdo" />適用期間内
                         </div>
                        </td>
                     </tr>
                     <tr>
                        <td>
                            <div style = " border:1px solid #000;
                                width:150px; height:25px; position:relative; left:21px; top:25.5px; ">
                                                                           申請組織コード					
                            </div>
                            <div style = " border:1px solid #000; position:relative; left:170px; width:220px; " >
                                    <input type = "text" id = "apporgcod" maxlength = "12" value="" name= "apporgcod" style = " width:220px; height:24px; " onchange = " apporgcodRegularTest( this.value ); " />
                            </div>
                        </td>
                     </tr>
                     <tr>
                        <td>
                            <div style = " border:1px solid #000 ;
                                 width:150px; height:25px; position:relative; left:21px; top:25.5px; ">
                                                                        トラッキングＧコード				
                            </div>
                            <div style = " border:1px solid #000; position:relative; left:170px; width:220px; ">
                                 <input type = "text" id = "trkgrpcod" value="" name = "trkgrpcod" style = " width:220px; height:24px; " onchange = " trkgrpcodRegularTest( this.value ); " />
                                 <input type = "text" id = "tntcod" maxlength = "12"  value="${list.tntcod}" hidden = "hidden" />
                            </div>
                            <div style = "border:1px solid #000;
                                 width:150px; height:25px; position:relative; left:461px; top:-22.5px; ">
                                                                        トラッキングＧ名称					
                            </div>
                            <div style = " border:1px solid #000; position:relative; left:610px; width:220px; top:-48px;">
                                 <input type = "text" id = "trkgrpnam" maxlength = "6"  value="" name = "trkgrpnam" style = " width:220px; height:24px;" onchange = " trkgrpnamRegularTest(); " />
                            </div>
                            <div style = " border:1px solid #000; position:relative; left:850px; width:70px; top:-72px;">
                                <input type = "button" value ="検索" id = "select_Btn" onclick = "selectDate();" class = "button_normal" />
                            </div>
                        </td>
                     </tr>
                     <tr>
                        <td colspan = "2" >
                           <table class = "data_table" >
                            <thead>
                             <tr>
                               <th class = "col_header" > 選択 </th>
                               <th class = "col_header" > 廃止 </th>
                               <th class = "col_header" > 申請組織 </th>
                               <th class = "col_header" >トラッキングＧコード</th>
                               <th class = "col_header" >トラッキングＧ名称</th>
                               <th class = "col_header" > イベント数 </th>
                             </tr>
                             </thead>
                             <tbody id = "org_List" ></tbody>
                            </table>
                        </td>
                     </tr>
                 </table>
                 <table class = "common_area">
                     <tr>
                        <td align = "right" >
                            <input type = "button" value="新規" id = "insert_Btn" onclick = "addData();" class = "button_normal" />
                            <input type = "button" value="引用" id = "modify_Btn" onclick = "reference();" class = "button_normal" />
                            <input type = "button" value="変更" id = "modify_Btn" onclick = "updateData();" class = "button_normal" />
                       	</td>
                     </tr>
                     <tr>
                        <td align = "left" >
                            <input type = "button" value="戻る" id = "backDashBoard_Btn" name = "backDashBoard_Btn"
                                    onclick = "javascript:history.go(-1);" class = "button_normal" />
                        </td>
                    </tr>
                 </table>
              </td>
           </tr>
        </table>
      </td>
    </tr>
   </table>
  </form>
  
 </body>
</html>