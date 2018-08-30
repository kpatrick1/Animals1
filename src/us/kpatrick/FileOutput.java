package us.kpatrick;

import java.io.*;

/**
 * create/output to a file
 * @author kpatr
 * @version 1.1.2
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     * Create a file to write to
     * @param fileName name of file to create
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * write to the file
     * @param line The line to write to the file
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Close the file being worked with
     *
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}