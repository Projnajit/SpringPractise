package org.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practise {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        helperClass h1= (helperClass) context.getBean("setterInjection");
        System.out.println(h1.toString());
        context.registerShutdownHook();
    }
}
