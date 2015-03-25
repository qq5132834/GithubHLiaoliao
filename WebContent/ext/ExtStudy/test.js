Ext.onReady(function(){
	
	
	var comp = Ext.create('Ext.Component',{
				constrain: true,
			    floating: true,
			    style: {
			        backgroundColor: 'red',
			        border: '1px solid black'
			    },
			    html: '<iframe src="https://www.baidu.com/"></iframe><input type="button" value="click" onclick="alert()"  />',
			    draggable: {
			        delegate: 'h1'
			    }
		
			});
	comp.draggable = true;
	comp.show();
	
});