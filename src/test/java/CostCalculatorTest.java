import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

class CostCalculatorTest extends TestCase {

    private CostCalculator costCalculator;
    BigDecimal COST = BigDecimal.valueOf(0.3);

    @Before
    public void setUpCalculator(BigDecimal cost){
        CostCalculator costCalculator = new CostCalculator(COST);
    }

    @Test
    public void CostCalculatorTest (){
        assertEquals(costCalculator.calculateCost(5), BigDecimal.valueOf(1.5));
    }

    @Test
    public void costOfSms(){
        int numberOfSMS = 10;
        assertTrue(costCalculator.calculateCost(numberOfSMS).equals(BigDecimal.valueOf(3)));
    }

    @Test
    public void calculateEmptySms(){
        assertEquals(costCalculator.calculateCost(0), COST);
    }

    /*
    void toUpperCase(String expected, String input) {
        assertEquals(expected, Main.(input));
    }
    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("TEST", "test"),
                Arguments.of("TEST TEST", "test test"),
                Arguments.of("XXX", "xxx"),
                Arguments.of("HELLO?", "hello?")
       */
}
