package level02.exercise1.observer;

import level02.exercise1.enums.Event;

public record MobileAppObserver(String userName) implements Observer {

    @Override
    public void update(Event eventType) {
        System.out.println("Sending mobile app notification to " + userName + " concerning " + eventType);
    }

}
