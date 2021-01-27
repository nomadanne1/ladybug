<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"  %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action</title>
</head>
<body>
<%
	Map<String, String[]> map = request.getParameterMap();
	Set<String> keys = map.keySet();
	Iterator<String> it = keys.iterator();
	
	while (it.hasNext()) {
		
		String key = it.next();
		String value = map.get(key)[0];
		out.println(key + "=" + value + "<br>");
	}
%>
</body>
</html>