package Cantor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    private static final float TEST_AMOUNT = 5.56f;
    private static final Currency TEST_CURRENCY = Currency.PLN;
    private Money money;

    @BeforeEach
    void setUp() {
        money = new Money(TEST_AMOUNT, TEST_CURRENCY);
    }

    @Test
    void testGetCurrency() {
        assertEquals(TEST_AMOUNT, money.getAmount());
    }

    @Test
    void testGetAmount() {
        assertEquals(TEST_AMOUNT, money.getAmount());
    }

    @Test
    void testToString() {
        assertEquals(TEST_CURRENCY + " " + TEST_AMOUNT, money.toString());
    }

    @Test
    void testEquals() {
        assertEquals(new Money(TEST_AMOUNT, TEST_CURRENCY), money);
    }

    @Test
    void testParse() {
        assertEquals(money, Money.parse(money.toString()));
    }

}