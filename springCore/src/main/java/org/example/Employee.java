package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
    private int empId;
    private String empName;
    private  String  empAddress;

    public Employee(int empId, java.lang.String empName, java.lang.String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public Employee() {
        super();
    }

    public int getEmpId() {
        return empId;
    }

//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }

    public java.lang.String getEmpName() {
        return empName;
    }

//    public void setEmpName(java.lang.String empName) {
//        this.empName = empName;
//    }

    public java.lang.String getEmpAddress() {
        return empAddress;
    }

//    public void setEmpAddress(java.lang.String empAddress) {
//        this.empAddress = empAddress;
//    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName=" + empName +
                ", empAddress=" + empAddress +
                '}';
    }

//    public void init(){
//        System.out.println("init working...");
//    }
//
//    public void destroy(){
//        System.out.println("destroyed...");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init working...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed....");
    }
}