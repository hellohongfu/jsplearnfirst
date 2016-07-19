<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<jsp:include page="login.jsp"></jsp:include>
</div>
	<%
		int first = 0;
		int second = 0;
		if (request.getParameter("first") != null && request.getParameter("first").length() > 0) {

			first = Integer.parseInt(request.getParameter("first"));

		}

		if (request.getParameter("second") != null && request.getParameter("second").length() > 0) {

			second = Integer.parseInt(request.getParameter("second"));

		}
	%>
	<b><%=first + second%></b>

	<br />
	<jsp:include page="text"></jsp:include>
	<br />

	<jsp:include page="index.html"></jsp:include>
</body>

<jsp:forward page="2.jsp">

		<jsp:param  name="param" value="test2.2j" />
</jsp:forward>


</html>