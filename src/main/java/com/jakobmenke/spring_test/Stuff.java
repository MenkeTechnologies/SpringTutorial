package com.jakobmenke.spring_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Stuff {
    public static void main(String[] args) {

    }

     static void first(ApplicationContext applicationContext) {
        Logger logger = (Logger) applicationContext.getBean("logger");

        logger.writeConsole("console");

        logger.writeFile("file");

        System.out.println(logger.getConsoleWriter().test);

        Person p = (Person)applicationContext.getBean("person");

        System.out.println(p);
    }

    static void old() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/jakobmenke/beans/beans.xml");

//        peeps(applicationContext);

        Animal igor = (Animal) applicationContext.getBean("animal1");

        System.out.println(igor);
    }

     static void peeps(ApplicationContext applicationContext) {
        Person p = (Person) applicationContext.getBean("person");

        Person p2 = (Person) applicationContext.getBean("person2");

        Address address2 = (Address) applicationContext.getBean("address2");

        System.out.println();
        System.out.println(address2);

        p2.setTaxId(25);

        System.out.println();

        System.out.println(p);

        System.out.println(p2);
    }

     static void shutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("bye");
        }));
    }

    static void tonka() {

        System.out.println("coolio at home braahs ___" + System.getProperty("java.io.tmpdir"));
    }

    public static  void xxxxx(){

    }
}
