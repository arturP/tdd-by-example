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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        return amount != null ? amount.equals(dollar.amount) : dollar.amount == null;
    }

    @Override
    public int hashCode() {
        return amount != null ? amount.hashCode() : 0;
    }
}
