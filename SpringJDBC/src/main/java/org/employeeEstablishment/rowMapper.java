package org.employeeEstablishment;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class rowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getInt(2));
        emp.setName(rs.getString(1));
        emp.setGender(rs.getString(6));
        emp.setPassword(rs.getString(3));
        emp.setEmail(rs.getString(4));
        emp.setDesignation(rs.getString(5));
        emp.setProjectType(rs.getString(7));

        return emp;
    }
}
