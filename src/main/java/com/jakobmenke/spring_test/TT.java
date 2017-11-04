package com.jakobmenke.spring_test;

import java.io.File;

class TT {
    public static void main(String[] args) {

        File f = new File("t.txt");

        File ff = new File("g.txt");

            if(!f.renameTo(ff)){
                System.err.println("no renmae");
            } else {
                System.out.println("rename");
            }

    }
}
