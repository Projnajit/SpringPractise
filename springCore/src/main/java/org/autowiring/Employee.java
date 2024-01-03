package org.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Employee {

    private int id;
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Autowired
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", friends=" + friends +
                ", address=" + address +
                '}';
    }
}
