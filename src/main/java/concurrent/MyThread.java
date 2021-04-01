package concurrent;

import javax.swing.*;

public class MyThread extends Thread {

    static int i = 0;
    public void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j=0; j<100; j++) {
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("i="+i);

    }



}

