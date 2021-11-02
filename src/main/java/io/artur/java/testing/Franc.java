package io.artur.java.testing;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 */
public class Franc extends Money{

    public Franc(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public Franc multiply(int times) {
        return new Franc(this.amount.multiply(BigDecimal.valueOf(times)).doubleValue());
    }
}
