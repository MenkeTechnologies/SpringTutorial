package com.jakobmenke.spring_test;

import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

class App {
    private void dao() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/bean2.xml");

        try {
            OffersList offersList = (OffersList) applicationContext.getBean("offersDao");

            for (Offer offer : offersList.getOffers()) {
                System.out.println("tonka got " + offer);
            }

            Offer offer = offersList.getOff(2);

            Gson gson = new Gson();

            String pp = gson.toJson(offer);

            System.out.println(pp);


            System.out.println(offer);
        } catch (CannotGetJdbcConnectionException e) {
            e.printStackTrace();
            System.out.println();
        } catch (DataAccessException d) {
            d.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new App().dao();
    }

    private void new_stuff() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/bean2.xml");

        Robo robo = (Robo) applicationContext.getBean("robo");

        robo.tonka("tommy");

        System.out.println(robo);

        System.out.println(robo.getSpeech());
    }
}
