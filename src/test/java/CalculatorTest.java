import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Before
    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(1, 3));
    }

}
