package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;
import ObserverPattern.Observer.WhatsAppObeserverImpl;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver whatAppUser1 = new WhatsAppObeserverImpl("123456", iphoneObservable);
        NotificationAlertObserver whatsAppUser2 = new WhatsAppObeserverImpl("234567", iphoneObservable);

        NotificationAlertObserver emailUser = new EmailAlertObserverImpl("xyz@gmail.com", iphoneObservable);

        iphoneObservable.add(whatAppUser1);
        iphoneObservable.add(whatsAppUser2);
        iphoneObservable.add(emailUser);

        iphoneObservable.setStockCount(10);
        System.out.println("New Stock added ");
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(10);

    }
}
