<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%@ include file="header.jsp" %>
<%!
    int x = 4;
    String gatherName() {
        return "Gabi";
    }
    static int anotherMethod() {
        return 5;
    }
%>
<%
    String name = this.gatherName();
    int a1 = anotherMethod();
    int b1 = this.anotherMethod(); // accepted by J2EE, but not ok because it is a static method
%>
<p>Hello, <%=name%>! How are you?</p>
<p>x = <%=x%></p>

<form action="<%=request.getContextPath()%>/hello-servlet" method="post">
    <p>
        <label for="fullname_input">Your name:</label>
        <input id="fullname_input" name="fullname" value="" />
    </p>
    <p>
        <label for="address_input">Your address:</label>
        <textarea id="address_input" name="address"></textarea>
    </p>
    <p>
        <label for="agreement_checkbox">Do you agree?</label>
        <input id="agreement_checkbox" name="agreement" type="checkbox" value="1" />
    </p>
    <input type="submit" value="Send info" />
</form>
</body>
</html>