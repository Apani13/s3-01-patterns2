package level02.exercise1;

import level02.exercise1.observable.Stockbroker;
import level02.exercise1.observer.EmailMsgObserver;
import level02.exercise1.observer.MobileAppObserver;

import static level02.exercise1.enums.Event.*;

public class Main {

    public static void main(String[] args) {

        Stockbroker stockbroker = new Stockbroker();
        stockbroker.getService().subscribe(STOCK_MARKET_GOES_DOWN, new EmailMsgObserver("apani13@hehe.com"));
        stockbroker.getService().subscribe(STOCK_MARKET_GOES_DOWN, new MobileAppObserver("Anderina98"));

        stockbroker.getService().subscribe(STOCK_MARKET_RISES, new EmailMsgObserver("anderina98@hihi.com"));
        stockbroker.getService().subscribe(STOCK_MARKET_RISES, new MobileAppObserver("Apani13"));


        stockbroker.stockMarketGoesDown();

        System.out.println("==========================================");

        stockbroker.stockMarketRises();

        System.out.println("==========================================");

        stockbroker.getService().unsubscribe(STOCK_MARKET_RISES, new EmailMsgObserver("anderina98@hihi.com"));
        stockbroker.stockMarketRises();

    }

}
