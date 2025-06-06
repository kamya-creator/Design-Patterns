package StrategyDesignPattern.strategy;

public class CreditCardStrategy implements PayingStrategy{
    @Override
    public void pay() {
        System.out.println("Pay Using Credit Card");
    }
}
