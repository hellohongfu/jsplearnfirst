<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<div>
<jsp:include page="login.jsp"></jsp:include>
</div>
username=<%= request.getParameter("name") %><br>
password=<%=request.getParameter("password") %>

set cookie
<%
 String name=  request.getParameter("name") ;
// String name2=new String(name.getBytes("gb2312"),"gb2312");
 
 Cookie cookie=new Cookie("user",name);
 cookie.setMaxAge(10);
 response.addCookie(cookie);
 
 session.setAttribute("login","login");
 session.setAttribute("userName", name);
%>

<a href ="2.jsp">跳转</a>

</body>
</html>