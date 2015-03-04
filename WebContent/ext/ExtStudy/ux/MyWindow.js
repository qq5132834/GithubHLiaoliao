	 Ext.define("ExtStudy.ux.MyWindow",{
	 	extend : 'Ext.window.Window',
	 	width : 300,
	 	height : 300,
	 	title : 'First window',
	 	newTitle : '棒棒哒',
	 	config:{ //放在config的成员变量，系统会自动生成get和set方法，比如getPrice() 和 setPrice(price)
	 		price : 500
	 	},
	 	setTitle : function(){
	 		this.title = this.newTitle;
	 		console.log(this.title);
	 	},
	 	constructor: function (config) {
			 //add something
	 		 this.setTitle();
	 		 
	         this.callParent(arguments);  
	    },
	    getTitle : function(){
	    	return this.title;
	    }
	 });
