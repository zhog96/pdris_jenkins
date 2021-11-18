package countdown;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        Main.main(null);
        assertEquals("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n", stream.toString());
    }
}
