/*
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CostCalculatorParameterizedTest {


    @Test
    @Parameters(method = "calcValues")
    public void simpleCalcTest(BigDecimal unitCost,
                               int numberOfMessages,
                               BigDecimal expectedValue){
        CostCalculator calc = new CostCalculator(unitCost);
        assertEquals(expectedValue, calc.calculateCost(numberOfMessages));
    }

    private Object[] calcValues() {
        return new Object[]{
                new Object[]{new BigDecimal(0), 100, new BigDecimal(0)},
                new Object[]{new BigDecimal(0.3), 10, new BigDecimal(3)},
                new Object[]{new BigDecimal(0.3), 0, new BigDecimal(0)},
        };
    }

} */
