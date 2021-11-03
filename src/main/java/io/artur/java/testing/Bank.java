package io.artur.java.testing;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Bank {

    private final Map<Pair, BigDecimal> rateMap = new HashMap<>();

    public Money reduce(Expression source, String toCurrency) {

        return source.reduce(this, toCurrency);
    }

    public BigDecimal rate(String from, String to) {
        if (from.equals(to)){
            return BigDecimal.ONE;
        }
        return this.rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, BigDecimal rate) {
        this.rateMap.put(new Pair(from, to), rate);
    }
}
