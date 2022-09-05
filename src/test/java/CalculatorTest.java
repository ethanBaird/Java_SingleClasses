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

}
