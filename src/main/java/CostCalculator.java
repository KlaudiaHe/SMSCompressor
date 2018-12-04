import java.math.BigDecimal;
import java.util.Collection;

public class CostCalculator {

    private final BigDecimal COST; //lepiej bez duzych liter jak final;
    BigDecimal finalCost;

     public CostCalculator(BigDecimal cost) {
         COST = cost;
     }


    public BigDecimal calculateCost (Collection<String> pieces) {
         finalCost = BigDecimal.valueOf(pieces.size()).multiply(COST);
         return finalCost; //robić taką zmienną?
    }
}
