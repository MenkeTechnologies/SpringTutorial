package com.jakobmenke.spring_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private void dao() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/bean2.xml");

        OffersDAO offersDAO = (OffersDAO)applicationContext.getBean("offersDao");

        for (Offer offer : offersDAO.getOffers()) {
            System.out.println("tonka got " + offer);
        }
    }

    public static void main(String[] args) {

        new App().dao();
    }

    private void new_stuff() {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/bean2.xml");

        Robo robo = (Robo)applicationContext.getBean("robo");

        robo.tonka("tommy");

        System.out.println(robo);

        System.out.println(robo.getSpeech());

    }


}
