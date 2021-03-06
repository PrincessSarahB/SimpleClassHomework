import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle testWaterBottle;

    @Before
    public void before(){
        testWaterBottle = new WaterBottle(100);
    }
    @Test
    public void hasVolumeStartsAt100(){
        assertEquals(100, testWaterBottle.getVolume());
    }

    @Test
    public void drink(){
        testWaterBottle.drink();
        assertEquals(90, testWaterBottle.getVolume());
    }

    @Test
    public void empty(){
        testWaterBottle.empty();
        assertEquals(0, testWaterBottle.getVolume());
    }

    @Test
    public void fill(){
        testWaterBottle.fill();
        assertEquals(100, testWaterBottle.getVolume());
    }
}
