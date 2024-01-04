package org.employeeEstablishment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class employeeClass implements employeeInterface{
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    //insert query
    public int insert(Employee emp) {
        String query = "insert into users(name, id, password, email, designation, gender, projectType, imageName) values(?,?,?,?,?,?,?,?)";
        int result = this.template.update(query,emp.getName(),emp.getId(),emp.getPassword(),emp.getEmail(),emp.getDesignation(),emp.getGender(),emp.getProjectType(),emp.getImageName());
        return result;
    }

    //update query
    public int update(Employee emp) {
        String query =  "Update users set name=?, gender=?, designation=? where id=?";
        int result = this.template.update(query,emp.getName(),emp.getGender(),emp.getDesignation(),emp.getId());
        return result;
    }

    public Employee getSingleEmployeeInfo(int empId) {
        String query = "select * from users where id=?";
        RowMapper<Employee> rowMapper = new rowMapper();
        Employee emp = this.template.queryForObject(query, rowMapper, empId);
        return emp;
    }

    public List<Employee> getMultipleEmployeeInfo() {
        String query = "select * from users";
        List<Employee> employees= this.template.query(query,new rowMapper());

        return employees;
    }
}
