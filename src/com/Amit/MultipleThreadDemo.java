package com.Amit;

public class MultipleThreadDemo {
    public static void main(String[] args) {
        Test t = new Test();
        t.wait(0x64);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
    }
}
