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
        Dollar five = new Dollar(5.00);
        Dollar fiveMultipleTwo = five.multiply(2);

        assertEquals(BigDecimal.valueOf(10.00), fiveMultipleTwo.getAmount());
    }

    @Test
    void testEqualityOfMoneyDollar() {
        assertEquals(new Dollar(10), new Dollar(10));
        assertNotEquals(new Dollar(1), new Dollar(2));
    }

    @Test
    void testMultiplicationOfMoneyFranc() {
        Franc five = new Franc(5.00);
        Franc fiveMultipleTwo = five.multiply(2);

        assertEquals(BigDecimal.valueOf(10.00), fiveMultipleTwo.getAmount());
    }

    @Test
    void testEqualityOfMoneyFranc() {
        assertEquals(new Franc(10), new Franc(10));
        assertNotEquals(new Franc(1), new Franc(2));
    }

    @Test
    void compareTwoObjectDifferentTypesShouldNotEquals() {
        assertNotEquals(new Franc(3), new Dollar(3));
    }
}
