/**
 * 申明一个类 javascript
 */
 
function user(){
	//public
	this.name = '黄聊';
	this.age = 26;
	//private
	var email = '513283493@qq.com';
	//函数方法
	this.getEmail = function(){
		return email;	
	};	
}

var u = new user();   //定义个对象

console.log(u.age);
console.log(u.name);
console.log(u.getEmail());

/**
 * 类json格式的对象
 **/
var person = {
	name:'深圳大学',
	age:30,
	email:function(){
		return "513283439@163.com";
	}
}
console.log(person.name);
console.log(person.age);
console.log(person.email());

/**
 * Ext 创建类
 **/
 Ext.define("MyWin",{
 	
 	name:'黄聊 Ext',
 	age:26,
 	company:'格力电器',
	getLeader:function(){
		return "LGW";
	} 	
 });
 
 var win = Ext.create("MyWin");
 console.log(win.name);
 console.log(win.age);
 console.log(win.company);
 console.log(win.getLeader());
 
 /**
  * Ext 类的继承Ext.window.Window
  * */
 Ext.onReady(function(){
  
 	
 	/**
 	 * 异步加载js文件，注意加载路径是从当前文件的父文件夹往下找到需要记载的js文件。
 	 * 主要类型和路径名称保持一致
 	 * */
    Ext.require('ExtStudy.ux.MyWindow'); 
 
	 var myWindow = Ext.create("ExtStudy.ux.MyWindow",{
	 		title:'aaa' ,
	 		price:1000
	 	});
 	 var titl = myWindow.getTitle();
 	 console.info(titl);
 	 myWindow.show();
 	 alert(myWindow.getPrice());
 	 
 });
















