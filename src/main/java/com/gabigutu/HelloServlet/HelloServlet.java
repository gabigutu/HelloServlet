package com.gabigutu.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.setStatus(403);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        System.out.println("This is a console message");
        System.err.println("This is an error console message");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>POST response</h1>");
        out.println("<p>You sent the following info: ");

        Enumeration<String> parameters = request.getParameterNames();
        ArrayList<String> paramsNames = Collections.list(parameters);
        out.println("<ul>");
        for (String paramName : paramsNames) {
            out.println("<li>");
            out.println(paramName + ": " + request.getParameter(paramName));
            out.println("</li>");
        }
        out.println("</ul>");

        out.println("</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("I received a PUT request");
    }

    public void destroy() {
    }
}