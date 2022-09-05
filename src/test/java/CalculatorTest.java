import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(1, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(2.00, calculator.divide(10.00, 5.00), 0.00);
    }

}
