package StrategyDesignPattern.strategy;





/*
Payment krne ke ek se jayada algorithms h apne pass, isliye code repeated h har strategy m
, so ek interface banalo for interface of strategy , n make different children of strategy
at run time decide which strategy to use
 */
public class ShoppingCart {

    PayingStrategy payWithUPI ;

    void payWith(PayingStrategy payingStrategy)
    {
       payingStrategy.pay();
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.payWith(new UPIPaymentStrategy());

    }

}


