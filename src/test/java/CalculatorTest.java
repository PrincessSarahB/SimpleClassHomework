import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;
    @Before
    public void before() {
        testCalculator = new Calculator(3, 2);
    }
    @Test
    public void add(){
        assertEquals(5,testCalculator.add());}

    @Test
    public void subtract(){
        assertEquals(1, testCalculator.subtract());
    }


}
