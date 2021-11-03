package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public class Dollar extends Money{

    public Dollar(double amount, String currency) {
        super(amount, currency);
    }

    public Money multiply(int times) {
        return Money.dollar(amount.multiply(BigDecimal.valueOf(times)).doubleValue());
    }
}
