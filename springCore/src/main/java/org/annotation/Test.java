package org.annotation;

import org.lifeCycle.helperClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static double printing() {
        System.out.println("printing function is working...");
        return 125.3241;
    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        HelperClass c1= context.getBean("helperClass", HelperClass.class);

        System.out.println(c1.toString());
    }
}
