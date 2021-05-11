package activities;

import java.lang.*;

public class CounterThread extends Thread{
    private int number;

    public CounterThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread " + number + ": " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new CounterThread(1);

        System.out.println("Is Alive? " + thread.isAlive());
        thread.start();

        System.out.println("Is Alive? " + thread.isAlive());

        try {
            Thread.sleep(1000);
            System.out.println("Is Alive? " + thread.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
