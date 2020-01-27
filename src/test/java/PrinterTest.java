import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 100);
    }

    @Test
    public void numOfSheets() {
        assertEquals(20, printer.sheetsLeft());
    }

    @Test
    public void canPrint() {
        assertEquals("The printer does not have enough paper", printer.print(20,3));
    }

    @Test
    public void reducesToner() {
        printer.print(5,3);
        assertEquals(85, printer.getToner());
    }
}
