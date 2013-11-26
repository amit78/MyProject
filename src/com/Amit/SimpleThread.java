package com.Amit;

/**
 * Created by Amit on 24/11/13.
 */
public class SimpleThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }

    }
}
