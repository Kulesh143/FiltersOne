package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class iffy extends SimpleTagSupport {
    public boolean test;
    public void setTest(boolean test){
        this.test=test;
    }
    @Override
    public void doTag() throws JspException, IOException {
        if(test){
            StringWriter r=new StringWriter();
            getJspBody().invoke(r);
            getJspContext().getOut().write(r.toString());
        }
    }
}
