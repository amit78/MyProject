package com.Amit;

/**
 * Created by Amit on 24/11/13.
 */
public class Test implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("The current values :" + i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread Interrupted");

        }


    }
}
