package level02.exercise1.observable;

import static level02.exercise1.enums.Event.*;

public class Stockbroker {

    private final NotificationService notificationService;

    public Stockbroker() {
        notificationService = new NotificationService();
    }

    public void stockMarketRises() {
        notificationService.notifyAgencies(STOCK_MARKET_RISES);
    }

    public void stockMarketGoesDown() {
        notificationService.notifyAgencies(STOCK_MARKET_GOES_DOWN);
    }

    public NotificationService getService() {
        return notificationService;
    }

}
