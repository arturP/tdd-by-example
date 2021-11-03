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
    void testMultiplicationOfMoney() {
        Money fiveDollars = Money.dollar(5.00);
        assertEquals(BigDecimal.valueOf(10.00), fiveDollars.multiply(2).getAmount());

        Money fiveFrancs = Money.franc(5.00);
        assertEquals(BigDecimal.valueOf(10.00), fiveFrancs.multiply(2).getAmount());
    }

    @Test
    void testEqualityOfMoney() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(1), Money.dollar(2));
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

    @Test
    void simpleAdditionTest() {
        Money six = Money.dollar(6);
        Expression sum = six.plus(six);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(12), reduced);
    }

    @Test
    void plusReturnSumTest() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augmend);
        assertEquals(five, sum.addmend);
    }

    @Test
    void reduceSumTest() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    void reduceMoneyTest() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
}
