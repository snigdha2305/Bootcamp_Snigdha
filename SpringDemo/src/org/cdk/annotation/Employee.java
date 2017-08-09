package org.cdk.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //for the class to be detected by package
public class Employee {
    @Value("123")
    int id;
    @Value("Snigdha")
    String name;
    @Autowired //dependency injection
    Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee() {}
}
