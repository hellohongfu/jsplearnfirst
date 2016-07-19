<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<div>
<jsp:include page="login.jsp"></jsp:include>
</div>
<%
	String param= request.getParameter("param");
%>

<br>
this is 2.jsp<br>
param=<%=param %>

servername=<%= request.getServerName() %><br>

server port=<%=request.getServerPort() %>

<br>
remoteIpp=<%=request.getRemoteAddr() %>

<form action="test" method="post" >
	username : <input type="text" id="name" name="name"/>
	password:<input type="password" id="txtPassword" name="password" >
	<input type="submit" value="Submit"/>  
	
	<% 
	
	Cookie[] cookies=request.getCookies();
	
	for(int i=0; i<cookies.length; i++){
		
		out.println(i+"<br>");
		out.println("cookiename:"+cookies[i].getName()+"<br>");
		out.println("cookieValue:"+cookies[i].getValue()+"<br>");
	}
	
   for(Cookie c : cookies){
		
	   out.println("cookiename:"+c.getName()+"<br>");
	   out.println("cookieValue:"+c.getValue()+"<br>");
	}
	String cookieName=request.getCookies()[0].getName() ;
	
	String cookieValue=request.getCookies()[0].getValue();
	
	
	
	
	
	%> 
	
	Look at cookie name =<%=cookieName%>  Value:=<%=cookieValue %>
	
 
 
	
</form>
</body>
</html>