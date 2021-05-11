package homework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CopierThread.java
 * T-Max Jlateh Jr
 * tjlatehjr@yahoo.com
 * <p>
 * This class demonstrates how threads can make file operations faster
 */
public class CopierThread extends Thread {
    // Global variables
    public static int copiedFiles = 0;
    public static String destination;

    // Fields
    private final String inputFile;
    private long numberOfBytes;
    private IOException exception;

    // Constructor
    public CopierThread(String inputFile) {
        this.inputFile = inputFile.replace("\\", "/");
        numberOfBytes = 0;
        exception = null;
    }

    // Getters
    public long getNumberOfBytes() {
        return numberOfBytes;
    }

    public IOException getException() {
        return exception;
    }

    @Override
    public void run() {
        // Split the path of the input file/directory
        String[] split = inputFile.split("/");

        // Store the name only
        String name = split[split.length - 1];

        // File object
        File file = new File(inputFile);

        if (file.isDirectory()) {
            // Skip if the file path is a directory
            System.out.println("Skipping directory '" + file.getName() + "'...");
        } else {
            // If not, show that the file is being copied
            System.out.println("Copying file '" + name + "'...");
            try {
                // Copy the file
                FileUtils.copyFile(inputFile, destination + "/" + name);

                // Store the number of bytes copied
                numberOfBytes = file.length();

                // Increment the global variable of all files that were copied
                copiedFiles++;
            } catch (IOException e) {
                // If any exception is thrown, print the stackTrace
                e.printStackTrace();

                // Save the exception into a variable (field)
                exception = e;

                // Abort the copy using Thread interrupt() method
                this.interrupt();
            }
        }
    }// en dof run() method

    public static void main(String[] args) {
        // Store the name of the output directory passed as command line argument into a global variable
        destination = args[1];

        // Make sure the output is empty
        System.out.println("Clearing directory '" + args[1] + "'.");
        try {
            FileUtils.clearDirectory(args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // File object of the input directory
        File dir = new File(args[0]);

        // Store copies of the files in the input directory into an array
        File[] files = dir.listFiles();

        // ArrayList that stores threads
        List<CopierThread> threads = new ArrayList<>();

        // Verify that files array is not null
        assert files != null;

        // Iterate over the files in the directory
        for (File file : files) {
            // Create one CopierThread per file
            CopierThread thread = new CopierThread(file.getPath());

            // Add the newly create thread to the list
            threads.add(thread);

            // Move thread to runnable state
            thread.start();
        }// end of for loop

        // Variables meaningful for final output
        long totalNumberOfBytes = 0;
        long totalTime;
        long startTime = System.currentTimeMillis();

        // Iterate over the threads in the list of threads
        for (CopierThread thread : threads) {
            try {
                // Wait for the current thread to finish running, then joins
                thread.join();

                // Update totalNumberOfBytes variable with the thread field value
                totalNumberOfBytes += thread.getNumberOfBytes();
            } catch (InterruptedException e) {
                // throw an exception any occurs
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();

        // Calculate the time (in milliseconds) it took to copy all files
        totalTime = endTime - startTime;

        // Comprehensive output of all the operations
        System.out.println("Copied " + copiedFiles + " files (" + totalNumberOfBytes + " bytes) in " + totalTime + " milliseconds");
    }// end of main method
}// end of class
