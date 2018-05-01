import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before

    public void before(){
        testPrinter = new Printer(20, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(20, testPrinter.getPaper());
    }

    @Test

    public void print(){
        testPrinter.print(2,5);
        assertEquals(10, testPrinter.getPaper() );
    }

    @Test
    public void canNotPrint(){
        testPrinter.print(7, 3);
        assertEquals(20, testPrinter.getPaper());
    }

    @Test
    public void refill(){
        testPrinter.refill(100);
        assertEquals(120, testPrinter.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, testPrinter.getToner());
    }

    @Test
    public void canPrintToner(){
        testPrinter.print(2,5);
        assertEquals(90, testPrinter.getToner());
    }

}
