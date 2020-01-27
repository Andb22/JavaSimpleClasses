import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(7, 3);
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.addNumbers());
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtractNumbers());
    }

    @Test
    public void canMultiply(){
        assertEquals(21, calculator.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        assertEquals(2.3, calculator.divideNumbers(), 0.1);
    }


}



