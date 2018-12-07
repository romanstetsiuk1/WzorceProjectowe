package Cantor;

import java.util.Objects;

public class Money {

    private Currency currency;
    private float amount;

    public static Money parse(String moneyInString) {
        String[] split = moneyInString.split(" ");
        return new Money(Float.parseFloat(split[1]), Currency.valueOf(split[0]));
    }

    public Money(float amount, Currency currency) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public float getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return currency + " " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Float.compare(money.amount, amount) == 0 &&
                currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }
}
