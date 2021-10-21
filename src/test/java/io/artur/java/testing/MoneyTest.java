package io.artur.java.testing;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
public class MoneyTest {

    @Test
    void testMultiplicationOfMoney() {
        Dollar five = new Dollar(5.00);
        Dollar fiveMultipleTwo = five.multiply(2);

        assertEquals(BigDecimal.valueOf(10.00), fiveMultipleTwo.getAmount());
    }
}
