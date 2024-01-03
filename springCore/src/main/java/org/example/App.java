package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Chattogram!" );
        try {
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

            Employee emp1 = (Employee) context.getBean("constructorInjection");
            System.out.println(emp1);
            context.registerShutdownHook();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
