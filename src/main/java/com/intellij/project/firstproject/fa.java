package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class fa extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        fifa fc=(fifa) getParent();
        if(!fc.x){
            StringWriter sw=new StringWriter();
            getJspBody().invoke(sw);
            JspWriter w= getJspContext().getOut();
            w.write(sw.toString());
        }
    }
}
