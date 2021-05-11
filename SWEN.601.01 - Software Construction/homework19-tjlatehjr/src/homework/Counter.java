package homework;

/**
 * Counter.java
 * T-Max Jlateh Jr
 * tjlatehjr@yahoo.com
 * <p>
 * Using Thread to count up to a pre-defined limit passed as command line argument
 */
public class Counter extends Thread {
    // Global variable
    public static int countUpTo;

    // Field
    private final int number;

    // Initialising Constructor
    public Counter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        // Make sure a single value is passed as command line argument
        if (args.length != 1) {
            System.out.println("Usage: java homework.Counter <number>");

            // If not, throw an exception
            throw new NumberFormatException("Not exactly one command line argument");
        }

        // Store value passed as CLI in the global variable
        countUpTo = Integer.parseInt(args[0]);

        // Use iteration to create and start one thread for each number
        for (int i = 1; i <= countUpTo; i++) {
            // Create a thread
            Thread thread = new Counter(i);

            // Move the thread to runnable state
            thread.start();

            try {
                // Wait for the current thread to finish running, then joins
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }// end of for loop
    }// end of main method
}// end of class
