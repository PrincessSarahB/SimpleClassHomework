import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;
    @Before
    public void before() {
        testCalculator = new Calculator(10, 5);
    }
    @Test
    public void add(){
        assertEquals(15,testCalculator.add());}

    @Test
    public void subtract(){
        assertEquals(5, testCalculator.subtract());
    }

    @Test
    public void multiply(){
        assertEquals(50, testCalculator.multiply());
    }

    @Test
    public void divide(){
        assertEquals(2, testCalculator.divide());
    }


}
