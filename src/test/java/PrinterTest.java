import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 100);
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

    @Test
    public void canPrintIfExactPaper(){
        assertEquals(true, printer.print(10, 2));
    }

    @Test
    public void successfulPrintReducesPaper(){
        printer.print(10, 1);
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void unsuccessfulPrintDoesNotAffectPaper(){
        printer.print(10, 3);
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrintIfEnoughToner() {
        assertEquals(true, printer.print(10, 1));
    }

    @Test
    public void cantPrintIfNotEnoughToner(){
        Printer lowTonerPrinter = new Printer(20, 5);
        assertEquals(false, lowTonerPrinter.print(10, 1));
    }

    @Test
    public void reducesTonerByOnePerPagePrinted() {
        printer.print(10, 1);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void unsuccessfulPrintDoesNotAffectToner() {
        printer.print(10, 3);
        assertEquals(100, printer.getToner());
    }


}
