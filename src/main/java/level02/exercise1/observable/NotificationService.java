package level02.exercise1.observable;

import level02.exercise1.enums.Event;
import level02.exercise1.observer.Observer;

import java.util.*;

public class NotificationService {

    private Map<Event, List<level02.exercise1.observer.Observer>> stockAgencies;

        public NotificationService() {
        stockAgencies = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> stockAgencies.put(event, new ArrayList<>()));
    }

    public void subscribe(Event eventType, level02.exercise1.observer.Observer stockAgency ) {
        stockAgencies.get(eventType).add(stockAgency);
    }

    public void unsubscribe(Event eventType, Observer stockAgency ) {
        stockAgencies.get(eventType).remove(stockAgency);
    }

    public void notifyAgencies(Event eventType) {
        stockAgencies.get(eventType).forEach(stockAgency -> stockAgency.update(eventType) );
    }

}
