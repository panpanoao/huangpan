var a=true;
var myreg=/^[1][3,4,5,7,8][0-9]{9}$/;
var countdown = 60;
var localObj = window.location; //这个的意思是获取当前页面的地址
var protocol = location.protocol //获取http或https
var host = localObj.host //获取JSP地址栏IP和端口号 //localhost:8080
var contextPath = localObj.pathname.split("/")[1]; //获取项目名
var basePath = protocol +"//"+host;