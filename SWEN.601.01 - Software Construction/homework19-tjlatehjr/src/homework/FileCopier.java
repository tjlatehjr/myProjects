package homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * FileCopier.java
 * T-Max Jlateh Jr
 * tjlatehjr@yahoo.com
 * <p>
 * This class tests the utility methods in the FileUtils class
 */
public class FileCopier {
    public static void main(String[] args) throws NoSuchFileException {
        // Make sure the values passed as command line arguments are in the right format
        if (args.length != 2) {
            System.out.println("Usage: java homework.FileCopier <input dir> <output dir>");

            // If not, throw an exception
            throw new NoSuchFileException("Error : No such FIle exist with this path name");
        }

        // args[0] = input directory
        // args[1] = output directory
        System.out.println("Clearing directory '" + args[1] + "'.");

        // Clear output directory
        try {
            FileUtils.clearDirectory(args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // File object of the input directory
        File dir = new File(args[0]);

        // Store copies of the files in the input directory into an array
        File[] files = dir.listFiles();

        // Variables meaningful for final output
        int totalNumberOfBytes = 0;
        int numberOfFilesCopied = 0;
        long timeDifference;
        long timeBeforeCopying = System.currentTimeMillis();

        // Verify that files array is not null
        assert files != null;

        // Iterate over the files in the directory
        for (File file : files) {
            // Skip if the file path is a directory
            if (file.isDirectory()) {
                System.out.println("Skipping directory '" + file.getName() + "'...");
            } else {
                // If not, show that the file is being copied
                System.out.println("Copying file '" + file.getName() + "'...");
                String source = args[0] + "/" + file.getName();
                String destination = args[1] + "/" + file.getName();

                try {
                    // Copy the file from the input directory to the output directory
                    FileUtils.copyFile(source, destination);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Every time a file is copied, we keep track of the number of copied files and the amount of bytes copied
                totalNumberOfBytes += file.length();
                numberOfFilesCopied++;
            }
        }// end of for-each loop

        long timeAfterCopying = System.currentTimeMillis();

        // Calculate the time (in milliseconds) it took to copy all files
        timeDifference = timeAfterCopying - timeBeforeCopying;

        // Comprehensive output of all the operations
        System.out.println("Copied " + numberOfFilesCopied + " files (" + totalNumberOfBytes + " bytes) in " + timeDifference + " milliseconds.");
    }// end of main method
}// end of class
