import java.math.BigDecimal;

public class CostCalculator {

    private final BigDecimal COST; //lepiej bez duzych liter jak final;
    double finalCost;

     public CostCalculator(BigDecimal cost) {
         COST = cost;
     }

    public BigDecimal calculateCost (int pieces) {
        return BigDecimal.valueOf(pieces).multiply(COST);
    }
}
