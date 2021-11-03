package io.artur.java.testing;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 */
public abstract class Money {

    protected BigDecimal amount;
    protected String currency;

    public Money(double amount, String currency) {
        this.amount = BigDecimal.valueOf(amount);
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public abstract Money multiply(int times);

    public static Money dollar(double amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(double amount) {
        return new Franc(amount, "CHF");
    }

    public String currency() {
        return currency;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return amount != null ? amount.hashCode() : 0;
    }
}
