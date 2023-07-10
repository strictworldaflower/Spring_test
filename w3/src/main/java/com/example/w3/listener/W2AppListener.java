package com.example.w3.listener;

import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
@Log4j2
public class W2AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        log.info("-------------init-------------");
        log.info("-------------init-------------");
        log.info("-------------init-------------");

        ServletContext servletContext = sce.getServletContext();

        servletContext.setAttribute("appName", "W2");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        log.info("---------------destroy--------------");
        log.info("---------------destroy--------------");
        log.info("---------------destroy--------------");
    }
}
