package activities;

public class BlastOff extends Thread{
    @Override
    public void run() {
        int count = -10;
        while (true) {
            if (count < 0) {
                System.out.println("T" + count);
            } else {
                System.out.println("T+" + count);
            }
            count++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new BlastOff();
        thread.start();
    }
}
