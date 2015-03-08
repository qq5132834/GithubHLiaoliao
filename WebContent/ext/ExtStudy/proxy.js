Ext.onReady(function(){
	
	 Ext.define('Person',{
	 	extend:'Ext.data.Model',
	 	fields:[
	 		{name:'name',type:'auto'},
	 		{name:'age',type:'int'},
	 		{name:'college',type:'auto'}
	 	]
	 });
	 
	 var proxyAjax = Ext.create('Ext.data.proxy.Ajax',{
	 	url:'modelProxy.jsp',
	 	model:'Person',
	 	reader:'json'
	 });
	 proxyAjax.doRequest(Ext.create('Ext.data.Operation',{
	 	limit:10,
	 	start:2,
	 	action:'read'
	 }),
	 function(o){
	 	var text = o.response.responseText;//得到一个字符串
	 	var json = Ext.JSON.decode(text); //将字符串转变成为json格式
	 	console.log(json);
	 	console.log(json.name);
	 });
	//proxyAjax.getReader();

});