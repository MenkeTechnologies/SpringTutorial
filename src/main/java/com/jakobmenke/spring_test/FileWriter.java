
package com.jakobmenke.spring_test;

import org.springframework.stereotype.Component;

@Component
public class FileWriter {
    public void write(String text) {


        System.out.println("writitng to " + text);
    }

    public FileWriter() {
    }

    public static void main(String[] args) {

    }
}
