package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public class Franc extends Money{

    public Franc(double amount, String currency) {
        super(amount, currency);
    }

    public Money multiply(int times) {
        return Money.franc(this.amount.multiply(BigDecimal.valueOf(times)).doubleValue());
    }
}
