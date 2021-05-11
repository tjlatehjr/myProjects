package homework;

import java.io.*;
import java.nio.file.Files;

/**
 * FileUtils.java
 * T-Max Jlateh Jr
 * tjlatehjr@yahoo.com
 * <p>
 * This class provides utility method for File I/O operations
 */
public class FileUtils {
    /**
     * This method copyFile from the source file/directory passed as argument to a destination file
     *
     * @param source      name of source file/directory
     * @param destination name of destination file/directory
     * @throws IOException rethrow any IOException
     */
    public static void copyFile(String source, String destination) throws IOException {
        // File objects
        File sourceFile;
        File destinationFile;

        try {
            // Create File object using the arguments passed into the fucntion
            sourceFile = new File(source);
            destinationFile = new File(destination);

            // Copying file from source to destination directory
            Files.copy(sourceFile.toPath(), destinationFile.toPath());
        } catch (IOException ex) {
            // Print stackTrace and rethrow any exception that occur
            ex.printStackTrace();
            throw ex;
        }
    }// end of copyFile() method

    /**
     * Given the path to a directory, this method clears all files in the directory
     *
     * @param name path of the directory
     * @throws IOException rethrown any IOException
     */
    public static void clearDirectory(String name) throws IOException {
        try {
            // Create a file object
            File dir = new File(name);

            // Check if the object is a directory
            if (dir.isDirectory()) {
                // If true, all the files in the directory are copied to a File array
                File[] files = dir.listFiles();

                // Verify that files array is not null
                assert files != null;

                // Iterate over the files in the directory (array)
                for (File file : files) {
                    // Check if a file is deleted and print the appropriate message
                    if (file.delete()) {
                        System.out.println(file.getName() + " was successfully deleted");
                    } else {
                        throw new IOException(file.getName() + " wasn't successfully deleted");
                    }
                }
            } else {
                System.out.println("This is not a directory");
            }
        } catch (IOException ex) {
            // Rethrow exception if any occur
            ex.printStackTrace();
            throw ex;
        }
    }// end of clearDirectory() method
}// end of class
