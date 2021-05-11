package activities;

public class RunnableCounter implements Runnable{
    private int number;

    public RunnableCounter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable " + number + ": " + i);
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableCounter(1);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
