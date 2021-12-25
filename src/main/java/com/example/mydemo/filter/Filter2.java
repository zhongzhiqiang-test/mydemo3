package com.example.mydemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter2", urlPatterns = {"/*"})
public class Filter2 implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter2 init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter2 过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("退出filter2 过滤器");
    }

    @Override
    public void destroy() {
        System.out.println("filter2 destroy()");
    }
}
