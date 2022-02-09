package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class fi extends SimpleTagSupport {
    public boolean test;

    public void setTest(boolean test) {
        this.test = test;
        fifa p=(fifa) getParent();
        p.x=test;
    }


    @Override
    public void doTag() throws JspException, IOException {
if(test){
    StringWriter r=new StringWriter();
    getJspBody().invoke(r);
    JspWriter w=getJspContext().getOut();
    w.write(r.toString());
}
    }
}
