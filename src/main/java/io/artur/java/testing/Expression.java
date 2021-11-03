package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression money);
    Expression multiply(int times);
    BigDecimal getAmount();
}
