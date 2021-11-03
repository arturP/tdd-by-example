package io.artur.java.testing;

import java.math.BigDecimal;

/**
 *
 */
public class Bank {

    public Money reduce(Expression source, String toCurrency) {

        return source.reduce(toCurrency);
    }
}
