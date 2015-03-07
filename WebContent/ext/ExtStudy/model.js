Ext.onReady(function(){
	 //alert(0);
	/**
	 * 定义一个模型类，可以理解为 数据表的字段
	 * */
	//直接继承定义model类
	Ext.define('person',{
		extend:'Ext.data.Model',
		fields:[
			{name:'name',type:'auto'},
			{name:'age',type:'int'},
			{name:'email',type:'auto'}
			]
	});
	//通过regModel方法定义个model类
	Ext.regModel('person1',{
		fields:[
			{name:'name',type:'auto'},
			{name:'age',type:'int'},
			{name:'email',type:'auto'}
		]
	});
	//创建一个对象
	var per = Ext.create('person',{
		name:'黄liao',
		age:28,
		email:'513283439@qq.com'
	});
	
	console.log(per.get('name'));
	console.log(per.get('age'));
	console.log(per.get('email'));
	
	//使用proxy代理赋值
	Ext.define('User',{
		extend:'Ext.data.Model',
		fields:[
			{name:'name',type:'auto'},
			{name:'age',type:'int'},
			{name:'college',type:'auto'}
		],
		proxy:{
			type:'ajax',
			url:'modelProxy.jsp'
		}
	});
	
	var p = Ext.ModelManager.getModel('User');
	p.load(1, {
	    scope: this,
	    failure: function(record, operation) {
	        console.log('failure');
	        console.log(record);
	    },
	    success: function(record, operation) {
	        console.log('success');
	        console.log(record);
	    },
	    callback: function(record, operation, success) {
	         console.log('callback');
	         console.log(record);
	         console.log(operation);
	         console.log(success);
	    }
	});
 	
	
});