package org.removeXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Helper h1 = context.getBean("getHelper", Helper.class);
        h1.func();
        String name = h1.name.getName();
        System.out.println(name);
    }
}
