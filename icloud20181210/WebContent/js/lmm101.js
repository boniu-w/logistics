$(document).ready(function(){      
             
	$.validator.setDefaults({       
	}); 
	     
	jQuery.validator.addMethod("evtMrgCode", function(value, element) {       
	    return this.optional(element) || /^[0-9A-z!-\/]*$/.test(value);       
	},"イベント集計コードに使用できない文字が含まれています");
	
	
	jQuery.validator.addMethod("dspNum", function(value, element) {       
	    return this.optional(element) || /^[0-9A-z!-\/]*$/.test(value);       
	},"申請組織コードに使用できない文字が含まれています");
	
});