package com.example.demo.config;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author :小虎
 * @date :2017/12/27
 */


public class IndexFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init IndexFilter111");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter IndexFilter111");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}