import static org.junit.jupiter.api.Assertions.*;

import csc4700.FileReaderDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileReadersDemoTests {

    private String filename;

    @BeforeEach
    public void createTempFile() throws IOException {
        File tempFile = File.createTempFile("FileReadersDemoTests", "");
        this.filename = tempFile.getAbsolutePath();

        BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename));
        bw.write("Test Data");
        bw.close();
    }

    @AfterEach
    public void deleteTempFile() {
        File f = new File(this.filename);
        f.delete();
    }

    @Test
    public void testReadFile() throws IOException {
        // Setup
        FileReaderDemo frd = new FileReaderDemo(this.filename);

        // Test
        String contents = frd.readContents();

        // Verify
        assertEquals("Test Data", contents);
    }

    @Test
    public void testReadFileFakeFile() throws IOException {
        // Setup
        FileReaderDemo frd = new FileReaderDemo("foo.txt");

        // Test
        String contents = frd.readContents();

        // Verify
        assertEquals(null, contents);
    }

}
