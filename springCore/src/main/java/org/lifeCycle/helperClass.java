package org.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class helperClass {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public helperClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public helperClass(){
        super();
    }

    @Override
    public String toString() {
        return "helperClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Data processing started...");
    }

    @PreDestroy
    public void end(){
        System.out.println("Destroyed data processing...");
    }
}