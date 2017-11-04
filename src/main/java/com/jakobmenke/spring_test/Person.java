package com.jakobmenke.spring_test;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    private int id;
    private int taxId;

    private Address address;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person() {
    }

    public static Person getInstance(String name, int id){
        System.out.println("Creating person using factory method");

        return new Person(name, id);
    }

    public String getName() {
        return name;
    }


    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Autowired
    public void setId(int id) {
        this.id = id;
    }

    public int getTaxId() {
        return taxId;
    }

    public void onCreate(){
        System.out.println("Created: " + this);
    }

    public void onDestroy(){
        System.out.println("Destroyed: " + this);
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", taxId=" + taxId +
                ", address='" + address + '\'' +
                '}';
    }

    void speak(){
        System.out.println("speaking");
    }



}
