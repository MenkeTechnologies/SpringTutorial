package com.jakobmenke.spring_test;

public class Address {

    private String street;
    private String postcode;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init(){
        System.out.println("init address");
    }

    public void destroy(){
        System.out.println("destroy address");
    }

    public static void main(String[] args) {

    }
}
