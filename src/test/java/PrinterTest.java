import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20);
    }

    @Test
    public void hasPaper(){
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void canPrintIfEnoughPaper(){
        assertEquals(true, printer.print(10, 1));
    }

    @Test
    public void cantPrintIfNotEnoughPaper(){
        assertEquals(false, printer.print(10, 3));
    }




}
