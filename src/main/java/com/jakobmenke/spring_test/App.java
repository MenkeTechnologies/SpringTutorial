package com.jakobmenke.spring_test;

import org.apache.commons.io.FilenameUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    static void tonka (){
        System.out.println("coolio at home braahs ___" + System.getProperty("java.io.tmpdir"));
    }

    public static void main(String[] args) {

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/jakobmenke/beans/beans.xml");

        Person p = (Person) applicationContext.getBean("person");

        Person p2 = (Person) applicationContext.getBean("person");

        p2.setTaxId(25);

        System.out.println(p);

        System.out.println(p2);

        ((FileSystemXmlApplicationContext)applicationContext).close();

        System.out.println(FilenameUtils.getBaseName("/etc/passwd"));

        App.tonka();

    }
}
