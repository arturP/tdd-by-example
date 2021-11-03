package io.artur.java.testing;

/**
 *
 */
public class Sum implements Expression{
    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Money reduce(String toCurrency) {
        return new Money(addmend.amount.add(augmend.amount).doubleValue(), toCurrency);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money(this.addmend.amount.add(this.augmend.amount).doubleValue(), to);
    }
}
