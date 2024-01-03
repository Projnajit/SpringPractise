package org.example;

public class Employee {
    private String name;
    private int id;
    private String password;
    private String email;
    private String designation;
    private String gender;
    private String projectType;
    private String imageName;

    public Employee() {
    }

    public Employee(String name, int id, String password, String email, String designation, String gender, String projectType, String imageName) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.designation = designation;
        this.gender = gender;
        this.projectType = projectType;
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
