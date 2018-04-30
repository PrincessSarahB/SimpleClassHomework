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
}
