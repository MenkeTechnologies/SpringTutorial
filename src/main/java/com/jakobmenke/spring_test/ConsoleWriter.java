package com.jakobmenke.spring_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    String test;
    public void write(String text) {

        System.out.println("logging to " + text);
    }

    public ConsoleWriter() {
    }

    @Autowired
    public void setTest(@Value("cool") String test){
        this.test = test;
    }
}
