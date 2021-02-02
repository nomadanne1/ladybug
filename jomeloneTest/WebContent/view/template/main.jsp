<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainstyle.css" type="text/css"/>
 <script type="text/javascript"> 
 	var imgArray=new Array(); 
    imgArray[0]="${pageContext.request.contextPath}/images/조말론이달의2.jpg"; 
    imgArray[1]="${pageContext.request.contextPath}/images/조말론이달의3.jpg";
    imgArray[2]="${pageContext.request.contextPath}/images/조말론이달의4.jpg";
    function showImage(){ var imgNum=Math.round(Math.random()*2); 
    var objImg=document.getElementById("introimg"); 
    objImg.src=imgArray[imgNum]; setTimeout(showImage,3000); }
 </script>

 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" 
 integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>
<body onload="showImage()">

<c:import url="header.jsp"></c:import>
<c:import url="center.jsp"></c:import>
<c:import url="footer.jsp"></c:import>



</body>
</html>