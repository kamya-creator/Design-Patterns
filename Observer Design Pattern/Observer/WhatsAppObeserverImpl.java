package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class WhatsAppObeserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable;
    String mobileNumber;

    public WhatsAppObeserverImpl(String mobileNumber, StockObservable stockObservable)
    {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {

        System.out.println("New Product is available in stock with count: " + stockObservable.getStockCount());
        System.out.println("WhatsApp Notification - We have New Stocks now");
    }
}
