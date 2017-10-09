package com.jakobmenke.spring_test;

public class PersonFactory {
    public Person createPerson(String name, int id){
        System.err.println("__________Class:" + Thread.currentThread().getStackTrace()[1].getClassName()+ "____Line:" + Thread.currentThread().getStackTrace()[1].getLineNumber() +
        "___________ Created WITH Factory");
        return new Person(name, id);
    }
}
