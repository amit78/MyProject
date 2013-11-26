package com.Amit;

/**
 * Created by Amit on 24/11/13.
 */
public class SleepDemo {
    public static void main(String[] args) {
        Test t= new Test();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
