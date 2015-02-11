<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<title>http://localhost:8080/GitHubLiaoliao/index.jsp</title>
<link rel="stylesheet" type="text/css" href="ext4/resources/css/ext-all.css">
<script type="text/javascript" src="ext4/bootstrap.js"></script>
<script type="text/javascript" src="ext4/ext-all.js"></script>
<script type="text/javascript" src="ext4/locale/ext-lang-zh_CN.js"></script>
<script type="text/javascript">

Ext.onReady(function(){
 
	//
	Ext.MessageBox.alert("ExtJS", "Hello ExtJS");
	//var id = Ext.getCmp("nameff").getValue();
	//console.info(id);
	//alert("huanglio");
});

function clickooo(thisObj){
	alert("9");
	var id = Ext.getCmp("nameff").getValue();
	console.info(id);
	alert("3");
}

</script>
</head>
<body>
<input type="text" id="nameff" class="type" name="name" value="黄聊" /> 
<input type="text" id="age"  class="type" name="age" />
<input type="text" id="sex"  class="type" name="sex" />
<input type="button" value="button" onclick="clickooo(this)"/>
</body>
</html>
