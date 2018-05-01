import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;
    @Before
    public void before() {
        testCalculator = new Calculator();
    }
    @Test
    public void add(){
        assertEquals(15,testCalculator.add(10, 5));}

    @Test
    public void subtract(){
        assertEquals(5, testCalculator.subtract(10, 5));
    }

    @Test
    public void multiply(){
        assertEquals(50, testCalculator.multiply(10, 5));
    }

    @Test
    public void divide(){
        assertEquals(2, testCalculator.divide(10, 5));
//        need a delta 0.1 to make it accurate after the numbers passed in.
    }


}
