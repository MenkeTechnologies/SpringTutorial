package com.jakobmenke.spring_test;

public class test extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("dpne");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new test().start();

        new test().start();

        System.out.println("here");

        new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("__________Class:" + Thread.currentThread().getStackTrace()[1].getClassName()+ "____Line:" + Thread.currentThread().getStackTrace()[1].getLineNumber() +
            "___________ done");
        }).start();

    }
}
