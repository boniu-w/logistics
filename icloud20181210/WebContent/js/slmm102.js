    function tree(linkName) {
        
        ls = document.all[linkName].style;
        spanObj = document.all["span_" + linkName];
        
        if(ls.display == 'none') {
            ls.display = "block"
            spanObj.className = "open";
        } else {
            ls.display = "none"
            spanObj.className = "close";
        }
    }
    
    function toScreen(linkName) {
        document.all['screenId'].value=linkName;
        // test
        alert(document.all['screenId'].value);
        // submit
        //document.all['menu'].onclick;
    }
    
    
    function expandAll() {
//    	var srclist = "";
		for (i = 0; i < document.all.tags("Div").length; i++) {
//		    srclist += document.all.tags("Div")(i).id;
//		    srclist += " "
			document.all.tags("Div")(i).style.display = "block"
		}
		
		for (i = 0; i < document.all.tags("span").length; i++) {
			if (document.all.tags("span")(i).className != "arrow")
			document.all.tags("span")(i).className = "open";
		}
		
//		alert(srclist);
    }

    function closeAll() {
		for (i = 0; i < document.all.tags("Div").length; i++) {
			document.all.tags("Div")(i).style.display = "none"
		}
		
		for (i = 0; i < document.all.tags("span").length; i++) {
			if (document.all.tags("span")(i).className != "arrow")
			document.all.tags("span")(i).className = "close";
		}
		
    }
