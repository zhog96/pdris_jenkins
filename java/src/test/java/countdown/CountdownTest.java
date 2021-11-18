package countdown;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountdownTest {

    @Test
    void run() {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        new Countdown(10).run();
        assertEquals("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n", stream.toString());
    }
}