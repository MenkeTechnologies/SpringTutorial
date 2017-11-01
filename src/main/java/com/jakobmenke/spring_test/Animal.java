package com.jakobmenke.spring_test;

public class Animal {

String name;
String type;

Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address=" + address +
                '}';
    }

    public Animal() {
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
