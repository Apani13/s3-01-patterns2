package level02.exercise1.observer;

import level02.exercise1.enums.Event;

public record EmailMsgObserver(String email) implements Observer {
    @Override
    public void update(Event eventType) {
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }
}
