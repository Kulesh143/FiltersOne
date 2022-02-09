package com.intellij.project.firstproject.Controllers;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/todaylesson/*")
public class todaylesson implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet is initialized!!!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out=res.getWriter();
        out.print("<html><body>");
        out.print("<b>Welcome to Spring With Kulesh</b>");
        out.print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "copyright by Kulesh";
    }

    @Override
    public void destroy() {
        System.out.println("servlet is destroyed!!!!");
    }
}
