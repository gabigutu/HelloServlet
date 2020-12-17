<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
This is the header

<ul>
    <li><a href="hello-servlet">Hello Servlet Link</a></li>
</ul>

<%
    int c = 800;
%>

<!--<p>The number: <% c = c + 1; %></p>-->
<p>The number: <%=c%></p>
