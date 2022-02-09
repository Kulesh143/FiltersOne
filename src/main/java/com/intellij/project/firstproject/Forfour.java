package com.intellij.project.firstproject;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class Forfour extends SimpleTagSupport {
    public String var;
    public ArrayList items;
    public int begin;
    public int end;
    public int id;

    public void setVar(String var) {
        this.var = var;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void doTag() throws JspException, IOException {
        String value=items.get(id).toString();
        System.out.println(value);
        JspWriter w=getJspContext().getOut();
        getJspContext().setAttribute(var,value);
        StringWriter sw=new StringWriter();
        getJspBody().invoke(sw);
        w.write(sw.toString());
    }
}
