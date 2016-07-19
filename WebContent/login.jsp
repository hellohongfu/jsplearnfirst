<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

 <br>
    user login status:
  <%
  	Object status=session.getAttribute("login");
  	if(status!=null){
  		
  		out.println("欢迎： "+session.getAttribute("userName"));
  	}else{
  		
  		out.println("user hasn't login");
  		
  	}
  %>
</body>
</html>