/* coś nie gra z przybliżeniami

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CostCalculatorParameterizedTest {

    public static ArrayList<String> exemplarySms;
    public ArrayList<String> createExemplarySms() {
        exemplarySms = new ArrayList<>();
        exemplarySms.add("kujytr edscvfbgjy htgf");
        exemplarySms.add("fff eeeeee %%%");
        exemplarySms.add("lo98765ryhnbfgf");
        return exemplarySms;
    }

    @Test
    @Parameters(method = "calcValues")
    public void simpleCalcTest(BigDecimal unitCost,
                               ArrayList<String> exemplarySms,
                               BigDecimal expectedValue){
        CostCalculator calc = new CostCalculator(unitCost);
        assertEquals(expectedValue, calc.calculateCost(createExemplarySms()));
    }

    private Object[] calcValues() {
        return new Object[]{
                new Object[]{new BigDecimal(0), exemplarySms, new BigDecimal(0)},
                new Object[]{new BigDecimal(0.3), exemplarySms, new BigDecimal(0.9)},
                new Object[]{new BigDecimal(0.7), exemplarySms, new BigDecimal(2.1)},
        };



    }

}

  //public void testCostCalculator (){
   //    ArrayList<String> setOfExemplarySMS = new ArrayList<String>();
   //     setOfExemplarySMS.add("hgfds");
   //     setOfExemplarySMS.add("hgfds");
   //     setOfExemplarySMS.add("hytrgef");


*/