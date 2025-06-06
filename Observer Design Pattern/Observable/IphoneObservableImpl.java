package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{


    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {

        for(NotificationAlertObserver observer : observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {

        if(stockCount == 0)
        {
            stockCount = stockCount + newStockAdded;
            notifySubscriber();
        }

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
