import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {}

    @Test
    public void canAdd(){
        assertEquals(10, calculator.addNumbers());
    }
}
