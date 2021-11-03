package io.artur.java.testing;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 */
public class Money implements Expression {

    protected final BigDecimal amount;
    protected final String currency;

    public Money(double amount, String currency) {
        this.amount = BigDecimal.valueOf(amount);
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static Money dollar(double amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(double amount) {
        return new Money(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

    public Expression multiply(int times) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(times)).doubleValue(), this.currency);
    }

    public Expression plus(Expression money) {
        return new Sum(this, money);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Money money = (Money) o;

        return Objects.equals(amount, money.amount) && this.currency.equals(money.currency());
    }

    @Override
    public int hashCode() {
        return amount != null ? amount.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money(this.amount.divide(bank.rate(this.currency, to)).doubleValue(), to);
    }
}
