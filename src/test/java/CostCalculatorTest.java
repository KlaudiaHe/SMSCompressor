import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

class CostCalculatorTest extends TestCase {


    private CostCalculator costCalculator;
    BigDecimal COST = BigDecimal.valueOf(0.3);

    @Before
    public void setUpCalculator(BigDecimal cost){
        CostCalculator costCalculator = new CostCalculator(COST);
    }

@Test
    public void CostCalculator (){
        ArrayList<String> setOfExemplarySMS = new ArrayList<String>();
        setOfExemplarySMS.add("hgfds");
        setOfExemplarySMS.add("hgfds");
        setOfExemplarySMS.add("hytrgef");

        assertEquals(costCalculator.calculateCost(setOfExemplarySMS), BigDecimal.valueOf(0.9));
    }

@Test
    public void calculateEmptySms(){
        ArrayList<String> setOfExemplarySMS = new ArrayList<String>();
        setOfExemplarySMS.add(" ");
        assertEquals(costCalculator.calculateCost(setOfExemplarySMS), COST);
    }

}
