package in.sp.goodDesign;

import java.math.BigDecimal;

public class Invoive {
    private BigDecimal total;
    private String emailId;


    public Invoive(BigDecimal total, String emailId) {
        this.total = total;
        this.emailId = emailId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
