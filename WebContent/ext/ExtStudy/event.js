Ext.onReady(function(){
	
	Ext.define('User',{
		extend:'Ext.util.Observable',
		constructor:function(){
			doDriver=function(){
				this.fireEvent('driver','特论述');
			},
			this.addEvents(
				{'driver':true}
        	),
        	this.addListener("driver",function(milk){
        		alert(milk);
        	})        	
		}
	});
	console.log("aaaaaaacccccccccc");
	//var useraa = Ext.create('User',{});
	var a = new User();
	console.log("aaaaaaa");
	//user.doDriver();
	//user.doDriver();
	
	
});