package io.artur.java.testing;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *
 */
public class MoneyTest {

    @Test
    void testMultiplicationOfMoneyDollar() {
        Money five = Money.dollar(5.00);

        assertEquals(BigDecimal.valueOf(10.00), five.multiply(2).getAmount());
    }

    @Test
    void testEqualityOfMoneyDollar() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(1), Money.dollar(2));
    }

    @Test
    void testMultiplicationOfMoneyFranc() {
        Money five = Money.franc(5.00);

        assertEquals(BigDecimal.valueOf(10.00), five.multiply(2).getAmount());
    }

    @Test
    void testEqualityOfMoneyFranc() {
        assertEquals(Money.franc(10), Money.franc(10));
        assertNotEquals(Money.franc(1), Money.franc(2));
    }

    @Test
    void compareTwoObjectDifferentTypesShouldNotEquals() {
        assertNotEquals(Money.franc(3), Money.dollar(3));
    }

    @Test
    void currencyTest() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
