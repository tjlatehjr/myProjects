package activities;

import java.util.ArrayList;
import java.util.List;

public class ManyCounters {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Runnable runnable = new RunnableCounter(i);
            Thread thread = new Thread(runnable);
            threadList.add(thread);

            thread.start();
        }

        for (Thread thread: threadList) {
            try {
                thread.join();
                System.out.println("All Done!");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
