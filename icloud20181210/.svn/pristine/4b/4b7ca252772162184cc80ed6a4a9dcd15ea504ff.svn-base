// 字符最小长度验证（一个中文字符长度为2）
jQuery.validator.addMethod("stringMinLength", function(value, element, param) {
 var length = value.length;
 for ( var i = 0; i < value.length; i++) {
  if (value.charCodeAt(i) > 127) {
   length++;
  }
 }
 return this.optional(element) || (length >= param);
}, $.validator.format("长度不能小于{0}（一个中文字符长度为2）!"));

// 字符最大长度验证（一个中文字符长度为2）
jQuery.validator.addMethod("stringMaxLength", function(value, element, param) {
 var length = value.length;
 for ( var i = 0; i < value.length; i++) {
  if (value.charCodeAt(i) > 127) {
   length++;
  }
 }
 return this.optional(element) || (length <= param);
}, $.validator.format("长度不能大于{0}（一个中文字符长度为2）!"));

// 字符验证
jQuery.validator.addMethod("string", function(value, element) {
 return this.optional(element) || /^[\u0391-\uFFE5\w]+$/.test(value);
}, "不允许包含特殊符号!");

// 手机号码验证
jQuery.validator.addMethod("mobile", function(value, element) {
 var length = value.length;
 return this.optional(element) || (length == 11 && /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/.test(value));
}, "手机号码格式错误!");

// 电话号码验证
jQuery.validator.addMethod("phone", function(value, element) {
 var tel = /^(\d{3,4}-?)?\d{7,9}$/g;
 return this.optional(element) || (tel.test(value));
}, "电话号码格式错误!");

//日期验证
jQuery.validator.addMethod("newDate", function(value, element) {
 var da = /^\d{4}[\-]\d{2}[\-]\d{2}$/;
 return this.optional(element) || (da.test(value));
}, "请输入合法的日期");

// 邮政编码验证
jQuery.validator.addMethod("zipCode", function(value, element) {
 var tel = /^[0-9]{6}$/;
 return this.optional(element) || (tel.test(value));
}, "邮政编码格式错误!");

// 必须以特定字符串开头验证
jQuery.validator.addMethod("begin", function(value, element, param) {
 var begin = new RegExp("^" + param);
 return this.optional(element) || (begin.test(value));
}, $.validator.format("必须以 {0} 开头!"));

// 验证两次输入值是否不相同
jQuery.validator.addMethod("notEqual", function(value, element, param) {
 return value != $(param).val();
}, $.validator.format("两次输入不能相同!"));

// 验证值必须大于或等于特定值
jQuery.validator.addMethod("gtOrEqualTo", function(value, element, param) {
 return value >= $(param).val() || (value == "" );
}, $.validator.format("结束日期必须大于或等于开始日期!"));

// 验证值不允许与特定值等于
jQuery.validator.addMethod("notEqual", function(value, element, param) {
 return value != param;
}, $.validator.format("输入值不允许为{0}!"));

// 验证值必须大于特定值(不能等于)
jQuery.validator.addMethod("gt", function(value, element, param) {
 return value > param;
}, $.validator.format("输入值必须大于{0}!"));

// 验证值小数位数不能超过两位
jQuery.validator.addMethod("decimal", function(value, element) {
 var decimal = /^-?\d+(\.\d{1,2})?$/;
 return this.optional(element) || (decimal.test(value));
}, $.validator.format("小数位数不能超过两位!"));

// E-mail验证 
jQuery.validator.addMethod("email", function(value, element) {
 var mail = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
 return this.optional(element) || (mail.test(value));
}, "E-mail格式错误!");


// 季度和月份验证
jQuery.validator.addMethod("quarter", function(value, element, param) {
var qter = value ;
var month = $(param).val();
if (qter!="" && month !=""){
  return false;
} else {
return true;
}  
}, $.validator.format("季度和月份不能同时选择"));

// lvb403字符验证
jQuery.validator.addMethod("lvb403string", function(value, element) {
 return this.optional(element) || /^[A-Za-z0-9!-\/]*$/.test(value);
}, "不允许包含0到9,a到z,-/以外的字符!");

// lvb403日期验证
jQuery.validator.addMethod("lvb403date", function(value, element) {
 return this.optional(element) || /^[0-9\/]*$/.test(value);
}, "不允许包含0到9,a到z,-/以外的字符!");

// url验证 
jQuery.validator.addMethod("url", function(value, element) {
 var url = /http:\/\/[A-Za-z0-9\.-]{3,}\.[A-Za-z]{3}/;
 return this.optional(element) || (url.test(value));
}, "url格式错误!");