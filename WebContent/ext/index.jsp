<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<title>http://localhost:8080/GitHubLiaoliao/index.jsp</title>
<link rel="stylesheet" type="text/css" href="ext4/resources/css/ext-all.css">
<script type="text/javascript" src="ext4/ext-all.js"></script>
<script type="text/javascript" src="ext4/locale/ext-lang-zh_CN.js"></script>
<script type="text/javascript">

Ext.onReady(function(){
 
alert("huanglio");




Ext.define('User', {
    extend: 'Ext.data.Model',
    fields: [ 'name', 'email', 'phone' ]
});
var userStore = Ext.create('Ext.data.Store', {
    model: 'User',
    data: [
        { name: 'Lisa', email: 'lisa@simpsons.com', phone: '555-111-1224' },
        { name: 'Bart', email: 'bart@simpsons.com', phone: '555-222-1234' },
        { name: 'Homer', email: 'home@simpsons.com', phone: '555-222-1244' },
        { name: 'Marge', email: 'marge@simpsons.com', phone: '555-222-1254' }
    ]
});
Ext.create('Ext.grid.Panel', {
    renderTo: Ext.getBody(),
    store: userStore,
    width: 400,
    height: 200,
    title: 'Application Users',
    columns: [
        {
            text: 'Name',
            width: 100,
            sortable: false,
            hideable: false,
            dataIndex: 'name'
        },
        {
            text: 'Email Address',
            width: 150,
            dataIndex: 'email',
            hidden: true
        },
        {
            text: 'Phone Number',
            flex: 1,
            dataIndex: 'phone'
        }
    ]
});

});
</script>
</head>
<body>
https://github.com/qq5132834/GithubHLiaoliao.git
</body>
 
</html>
