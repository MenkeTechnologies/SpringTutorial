package com.jakobmenke.spring_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robo {

    String speech;

    public String getSpeech() {
        return speech;
    }

//    @Autowired
//    public void setSpeech(@Value("#{new java.util.Date().toGMTString()}") String speech) {
//        this.speech = speech;
//    }

    @Autowired
    public void setSpeech(@Value("#{T(Math).PI^25}") String speech) {
        this.speech = speech;
    }

    @Autowired
    public void tonka(@Value("#{4}") String s){
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Robo{" +
                "speech='" + speech + '\'' +
                '}';
    }
}
