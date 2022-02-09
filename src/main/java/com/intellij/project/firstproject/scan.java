package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class scan extends SimpleTagSupport {
    private int x;
    public void setX(int x){
        this.x=x;
    }
    @Override
    public void doTag() throws JspException, IOException {
        System.out.println(x);
    }
}
