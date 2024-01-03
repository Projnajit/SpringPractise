package org.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelperClass {
    @Value("#{T(org.autowiring.Employee).}")
    private double id;

    @Value("#{'Rasel'}")
    private String name;


    public HelperClass() {
        super();
    }

    public HelperClass(double id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getId() {
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

    @Override
    public String toString() {
        return "HelperClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
