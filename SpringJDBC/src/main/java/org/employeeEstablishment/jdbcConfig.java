package org.employeeEstablishment;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Driver;

public class jdbcConfig {

    @Bean("dataSource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/projnajit");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }


    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate template =new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    @Bean("employeeClass")
    public employeeClass getEmployeeDao() {
        employeeClass emp = new employeeClass();
        emp.setTemplate(getJdbcTemplate());
        return emp;
    }
}
