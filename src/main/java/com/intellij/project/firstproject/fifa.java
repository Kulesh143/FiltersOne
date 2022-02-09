package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class fifa extends SimpleTagSupport {
    public boolean x;
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter w=getJspContext().getOut();
        StringWriter sw=new StringWriter();
        getJspBody().invoke(sw);
        w.write(sw.toString());
    }
}
