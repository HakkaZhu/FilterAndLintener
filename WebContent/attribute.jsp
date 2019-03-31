<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//ServletContext  :application
		application.setAttribute("name", "张三");  //增加
		application.setAttribute("name", "张三丰");  //替换
		application.removeAttribute("name");
		
		//HttpSession   :session
		session.setAttribute("name", "李四");
		session.setAttribute("name", "李世石");
		session.removeAttribute("name");
		
		//ServletRequest  :request
		request.setAttribute("name", "王五");
		request.setAttribute("name", "王老五");
		request.removeAttribute("name");
	%>
</body>
</html>