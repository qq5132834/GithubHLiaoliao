Ext.onReady(function(){
	
	var store = Ext.create('Ext.data.TreeStore', {
	    root: {
	        expanded: true,
	        children: [
	            { 	text: "学习", 
	            	children: [
	                	{ text: "book report", leaf: true },
	                	{ text: "algebra", leaf: true}
	                ] 
	            },
	            
	            { 	text: "系统管理", 
	            	children: [
	                	{ text: "book report", leaf: true },
	                	{ text: "algebra", leaf: true}
	                ] 
	            }
	        ]
	    }
	});
	
	Ext.define('MyMenu',{
		extend:'Ext.tree.Panel',
		alias: ['widget.MyMenu'],
	    store: store,
	    rootVisible: false 
	});
	
	Ext.create('Ext.container.Viewport', {
	    layout: 'border',
	    items: [{
	        region: 'west',
	        collapsible: true,
	        title: '菜单栏',
	        width: 200 ,
	        xtype:'MyMenu'
	     }, {
	        region: 'center',
	        xtype: 'tabpanel', // TabPanel itself has no title
	        activeTab: 0,      // First tab active by default
	        items: {
	            title: '欢迎使用',
	            html: '欢迎使用系统'
	        }
	    }]
	});

});