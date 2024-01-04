package org.example;

import org.employeeEstablishment.Employee;
import org.employeeEstablishment.employeeClass;
import org.employeeEstablishment.jdbcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
        employeeClass emp=context.getBean("employeeClass", employeeClass.class);

        List<Employee> data = emp.getMultipleEmployeeInfo();

        for(Employee employee:data)
            System.out.println(employee.toString());

//        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
//        employeeClass empDao = context.getBean("employeeClass", employeeClass.class);

//        Employee emp = new Employee();

//        emp.setId(8569);
//        emp.setName("Faria");
//        emp.setDesignation("swe");
//        emp.setEmail("faria@gmail.com");
//        emp.setPassword("123");
//        emp.setProjectType("education");
//        emp.setImageName("dp.png");
//        emp.setGender("female");
//
//        int result = empDao.insert(emp);

//        emp.setName("Kulsum");
//        emp.setId(8569);
//        emp.setGender("female");
//        emp.setDesignation("student");
//
//        int result =  empDao.update(emp);
//        System.out.println(result);

//        System.out.println(empDao.getInfo(123  ).toString());

//        List<Employee> result = empDao.getMultipleEmployeeInfo();

//        for(Employee emp:result)
//            System.out.println(emp);
    }
}