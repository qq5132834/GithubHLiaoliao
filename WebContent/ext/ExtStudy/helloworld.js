/**
 * 开始学习Ext4，helloworld的开始
 * */
Ext.onReady(function(){
  
	Ext.MessageBox.alert("ExtJS", "Hello ExtJS");
	
	var array = [1,2,3,4,-1,-2];
	
	Ext.Array.each(array,function(item){
		console.log(item);
		if(item==-1){
			console.log("huangliao....");
			return false;
		}
	},this);
	
	var newArray = Ext.Array.filter(array,function(item){
		if(item>=0){
			console.log(item);
			return true;
		}else{
			return false;
		}
	},this)
	
	alert(newArray.toString());
	
 
	
	Ext.create("Ext.container.Viewport",{
		layout:"border",  
	    items:[  
	        {region:"north",title:"Up",height:50},  
	        {region:"south",title:"Down",height:50},  
	        {region:"west",title:"Left",width:200},  
	        {region:"east",title:"Right",width:200},  
	        {region:"center",title:"Center"}  
	    ],
	    renderTo:Ext.getBody()
	});

});