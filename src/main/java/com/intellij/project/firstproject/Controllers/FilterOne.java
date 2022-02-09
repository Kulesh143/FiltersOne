package com.intellij.project.firstproject.Controllers;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//@WebFilter(filterName = "FilterOne",urlPatterns = "/")
@Component
public class FilterOne implements Filter {
    int hitcount;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        hitcount++;
        request.setAttribute("counter",hitcount);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        hitcount=0;
    }
}
