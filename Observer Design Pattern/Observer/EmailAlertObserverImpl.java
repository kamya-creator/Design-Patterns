package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable;
    String emailId;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable)
    {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("New Product is available in stock with count: " + stockObservable.getStockCount());
        System.out.println("Got Email we have stock now");
    }
}
