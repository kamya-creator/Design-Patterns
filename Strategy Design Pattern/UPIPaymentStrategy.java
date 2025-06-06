package StrategyDesignPattern.strategy;

public class UPIPaymentStrategy implements PayingStrategy{
    @Override
    public void pay() {
        System.out.println("Pay Using UPI");
    }
}
