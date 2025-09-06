package level02.exercise1.observer;

import level02.exercise1.enums.Event;

public interface Observer {

    void update(Event eventType);
}
