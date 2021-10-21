package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public class Dollar {
    private BigDecimal amount;

    public Dollar(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Dollar multiply(int times) {
        return new Dollar(amount.multiply(BigDecimal.valueOf(times)).doubleValue());
    }

}
