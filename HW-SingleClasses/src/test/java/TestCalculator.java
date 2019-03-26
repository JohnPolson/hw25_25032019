import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestCalculator {

    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator(25.0, 5.0);
    }

    @Test
    public void addNums() {
        assertEquals(30.0, calculator.addNums(), 0.01);
    }

    @Test
    public void subtractNums() {
        assertEquals(20.0, calculator.subtractNums(), 0.01);
    }

    @Test
    public void divNums() {
        assertEquals(5.0, calculator.divNums(), 0.01);
    }

    @Test
    public void multNums() {
        assertEquals(125.0, calculator.multNums(), 0.01);
    }

}




