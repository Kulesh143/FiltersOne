<%@ page isErrorPage="true" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Spring Boot First App</title>
</head>
<body>
<%
    out.print("Error Message : ");
out.print(exception.getMessage());
%>
</body>
</html>

