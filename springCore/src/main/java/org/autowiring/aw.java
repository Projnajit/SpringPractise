package org.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aw {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
    }

}
