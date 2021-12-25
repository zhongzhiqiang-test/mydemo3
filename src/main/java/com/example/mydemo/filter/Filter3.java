package com.example.mydemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "AFilter3", urlPatterns = {"/*"})
public class Filter3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter3 init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter3 过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("退出filter3 过滤器");
    }

    @Override
    public void destroy() {
        System.out.println("filter3 destroy()");
    }
}
