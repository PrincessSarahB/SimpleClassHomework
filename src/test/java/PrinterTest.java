import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before

    public void before(){
        testPrinter = new Printer(20);
    }

    @Test

    public void print(){
        assertEquals(10, testPrinter.print(2,5));
    }

    @Test
    public void canPrint(){
        assertEquals(10, testPrinter.canPrint(2, 5));
    }

    @Test
    public void refill(){
        testPrinter.refill(100);
        assertEquals(120, testPrinter.getPaper());
    }
}
