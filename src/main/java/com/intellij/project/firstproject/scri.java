package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class scri extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        StringWriter r=new StringWriter();
        getJspBody().invoke(r);
        System.out.println(r);
    }
}
