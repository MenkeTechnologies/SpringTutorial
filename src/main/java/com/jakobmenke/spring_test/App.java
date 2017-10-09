package com.jakobmenke.spring_test;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.io.IOException;

public class App {

    static void tonka (){

        System.out.println("coolio at home braahs ___" + System.getProperty("java.io.tmpdir"));
    }

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("bye");
        }));

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/jakobmenke/beans/beans.xml");

        Person p = (Person) applicationContext.getBean("person");

        Person p2 = (Person) applicationContext.getBean("person2");

        p2.setTaxId(25);

        System.out.println(p);

        System.out.println(p2);



    }
}
