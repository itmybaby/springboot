package com.example.demo.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author :小虎
 * @date :2017/12/27
 */


public class IndexListener1 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("IndexListener1111 contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}