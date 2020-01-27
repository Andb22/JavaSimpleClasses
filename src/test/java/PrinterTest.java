import jdk.internal.org.objectweb.asm.util.Printer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void numOfSheets() {
        assertEquals(20, printer.sheetsLeft())
    }
}
