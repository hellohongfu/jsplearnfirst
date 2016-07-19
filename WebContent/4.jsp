<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,java.sql.*,model.User"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
    List<User> users=new  ArrayList<User>();
	if(request.getAttribute("users")!=null){
		users= (List<User>)request.getAttribute("users"); 
	}
	

  for(User user:users){%>
	Name :<%=user.Name %>
	&nbsp; Id:<%=user.Id %>
	<br>
	<%}
 %>

	创建的用户：
	<c:foreach items="${requestScope.users}" var="list">
	${list.Id } ${list.Name }<br>
	</c:foreach>

	创建的用户：
	<forEach items="${users}" var="obj"> ${obj.Id} </forEach>
</body>
</html>