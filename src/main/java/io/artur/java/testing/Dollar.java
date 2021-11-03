package io.artur.java.testing;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 */
public class Dollar extends Money{

    public Dollar(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public Money multiply(int times) {
        return new Dollar(amount.multiply(BigDecimal.valueOf(times)).doubleValue());
    }

}
