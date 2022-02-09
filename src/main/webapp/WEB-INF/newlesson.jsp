Filters
It is to do a validation part or a filtering part of the client requests without directly letting them
go that we use filters. Requests and responses get validated by Filters.

client------> filter1------>filter2------->(Web Container)
      <---------f1<-----------f2<----------Servlet

Mapping a url pattern to filter in web.xml
<filter>
      <filter-name>F</filter-name>
      <filter-class>fil</filter-class>
</filter>
<filter-mapping>
      <filter-name>F</filter-name>
      <url-pattern>/</url-pattern>
</filter-mapping>

filter url pattern and jsp or servlet url pattern must be the same to make  FILTER between a
servlet or jsp.

chain.doFilter(request,response);
says to proceed to the respective servlet or JSP.
*we can make a filter chain
*filters are put to a filter chain according to url pattern
*the jsp or servlet in the url pattern is the last accessed servlet or jsp in the filter chain
*When client sends a request, web container makes a filter chain
*The first request sent by client is to a filter and once it got request, response objects
and filter chains are made and calls doFilter.

mapping a servlet to a filter

<filter-mapping>
      <filter-name>F</filter-name>
      <servlet-name>A</servlet-name>
</filter-mapping>

inside doFilter

resp.getWriter().write("<h1>1</h1>");
chain.doFilter(request,response);
resp.getWriter().write("<h1>2</h1>");
chain.doFilter(request,response);

how to anotate a filter?

@WebFilter(filterName = "F1",urlPatterns = "/")

its in the filter mapping order that filters run when mapped in web.xml.

How to view Request Count using filters?

@Component
public class fil implements Filter {
private int hitCount;
@Override
public void init(FilterConfig filterConfig) throws ServletException {



}

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
hitCount++;

// Print the counter.
System.out.println("Site visits count :" + hitCount);
request.setAttribute("counter", hitCount);
// pass the request along the filter chain
chain.doFilter(request, response);


}

@Override
public void destroy() {
Filter.super.destroy();
hitCount=0;
}
}
<h1>Views</h1>
<h1>count<%=request.getAttribute("counter")%></h1>

