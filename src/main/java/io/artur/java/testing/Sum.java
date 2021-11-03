package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public class Sum implements Expression{
    final Expression augmend;
    final Expression addmend;

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
        return new Sum(this, money);
    }

    @Override
    public Expression multiply(int times) {
        return new Sum(this.augmend.multiply(times), this.augmend.multiply(times));
    }

    @Override
    public BigDecimal getAmount() {
        return this.addmend.plus(this.augmend).getAmount();
    }
}
