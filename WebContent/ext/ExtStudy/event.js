Ext.onReady(function(){
	
	Ext.define('User',{
		extend:'Ext.util.Observable',
		constructor:function(){
			
			this.addEvents(
            	'driver'
        	),
        	this.addListener('driver',function(milk){
        		alert(milk);
        	})        	
		},
		doDriver:function(){
			this.fireEvent('driver','特论述')
		}
		
	});
	
	var user = Ext.create('User',{});
	user.doDriver();
	
	
});