package com.Amit;

/**
 * Created by Amit on 24/11/13.
 */
public class MyThread {

    public static void main(String[] args) {

        SimpleThread thrd = new SimpleThread();
        Thread newThread = new Thread(thrd);
        newThread.start();

    }
}
