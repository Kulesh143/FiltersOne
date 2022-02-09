The scripting elements provides the ability to insert java code
inside the jsp. There are three types of scripting elements:

scriptlet tag
expression tag
declaration tag

A scriptlet tag is used to execute java source code in JSP.
Syntax is as follows:

<%  java source code %>

Example of JSP scriptlet tag
<html>
<body>
<% out.print("welcome to jsp"); %>
</body>
</html>

The code placed within JSP expression tag is written to the output
stream of the response. So you need not write out.print()
to write data.
It is mainly used to print the values of variable or method.

Syntax of JSP expression tag
<%=  statement %>

Example of JSP expression tag
In this example of jsp expression tag, we are simply displaying a welcome message.

<html>
<body>
<%= "welcome to jsp" %>
</body>
</html>

The JSP declaration tag is used to declare fields and methods.
<%!  field or method declaration %>
Example of JSP declaration tag that declares field
In this example of JSP declaration tag, we are declaring
the field and printing the value
of the declared field using the jsp expression tag.

index.jsp
<html>
<body>
<%! int data=50; %>
<%= "Value of the variable is:"+data %>
</body>
</html>