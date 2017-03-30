import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MyFirstJavaProgramTest {

    @Test
    public void shouldPrintHelloWorld() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MyFirstJavaProgram.main(null);

        assertEquals("Hello World!\n" , outContent.toString());
    }
}
