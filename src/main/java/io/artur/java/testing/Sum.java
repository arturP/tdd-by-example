package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public class Sum implements Expression{
    Expression augmend;
    Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {

        return new Money(this.addmend.reduce(bank, to).amount
                .add(this.augmend.reduce(bank, to).amount).doubleValue(), to);
    }

    @Override
    public Expression plus(Expression money) {
        return null;
    }

    @Override
    public BigDecimal getAmount() {
        return this.addmend.plus(this.augmend).getAmount();
    }
}
