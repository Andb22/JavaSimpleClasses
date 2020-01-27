import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(5, 5);
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.addNumbers());
    }
}
