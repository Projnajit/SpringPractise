package org.employeeEstablishment;

import java.util.List;

public interface employeeInterface {
    public int insert(Employee emp);
    public int update(Employee emp);
    public Employee getSingleEmployeeInfo(int empId);
    public List<Employee> getMultipleEmployeeInfo();
}

