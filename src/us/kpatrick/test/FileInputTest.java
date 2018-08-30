package us.kpatrick.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.kpatrick.FileInput;

import static org.junit.jupiter.api.Assertions.*;

class FileInputTest extends PetTest {
    FileInput indata;

    @BeforeEach
    void setUp() {
        FileInput indata = new FileInput("animals.txt");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fileReadLine() {


        String line;
        line = indata.fileReadLine();
        assertTrue(line instanceof String);


    }

}