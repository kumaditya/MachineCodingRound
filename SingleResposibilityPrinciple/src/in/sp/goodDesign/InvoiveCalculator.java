package in.sp.goodDesign;

import java.math.BigDecimal;

public class InvoiveCalculator {

    public BigDecimal calculateInvoive(Invoive invoive) {
        if (invoive == null || invoive.getTotal() == null) {
            return BigDecimal.ZERO;
        }
        return invoive.getTotal().multiply(new BigDecimal("0.18"));
    }


}
