package com.example.ticketing_demo.spring;

import com.example.ticketing_demo.helper.SpringHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainerTest {
    static ApplicationContext ac;

    @BeforeAll
    static void setUp() {
        ac = SpringHelper.getAnnotationContext();
    }

    @Test
    @DisplayName("check all beans")
    void checkAllBeans() {
        String[] beanNames = ac.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = ((AnnotationConfigApplicationContext) ac).getBeanDefinition(beanName);
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                System.out.println("beanDefinition = " + beanDefinition);
            }
        }
    }
}
