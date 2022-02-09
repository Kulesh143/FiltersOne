package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class test extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        System.out.println("Kulesh");
        JspWriter r=getJspContext().getOut();
        r.write("<h1>Kulesh</h1>");
    }
}
