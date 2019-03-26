import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        this.waterBottle = new WaterBottle(95);
    }

    @Test
    public void checkVolume() {
        assertEquals(95, waterBottle.checkVolume());
    }

    @Test
    public void takeDrink() {
        assertEquals(85, waterBottle.takeDrink());
    }

    @Test
    public void emptyOut() {
        assertEquals(0, waterBottle.emptyOut());
    }

    @Test
    public void fillUp() {
        assertEquals(100, waterBottle.fillUp());
    }

}
