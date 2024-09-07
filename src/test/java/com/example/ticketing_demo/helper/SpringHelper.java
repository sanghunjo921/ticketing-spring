package com.example.ticketing_demo.helper;

import com.example.ticketing_demo.config.AppAutoConfig;
import com.example.ticketing_demo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringHelper {
    public static ApplicationContext getAnnotationContext() {
        return new AnnotationConfigApplicationContext(AppConfig.class);
    }

    public static ApplicationContext getXmlApplicationContext() {
        return new GenericXmlApplicationContext("appConfig.xml");
    }

    public static ApplicationContext getAutoAnnotationContext() {
        return new AnnotationConfigApplicationContext(AppAutoConfig.class);
    }

}
