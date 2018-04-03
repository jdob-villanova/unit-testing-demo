package csc4700;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {

    private String filename;

    public FileReaderDemo(String filename)
    {
        this.filename = filename;
    }

    public String readContents() throws IOException {

        File checkMe = new File(this.filename);
        if (!checkMe.exists()) {
            return null;
        }

        BufferedReader reader = new BufferedReader(new FileReader(this.filename));
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }

        return stringBuilder.toString();
    }

}
