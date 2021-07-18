package p10.observer.event;

import lombok.Getter;
import lombok.Setter;

/**
 * 通知者1
 */
public class Boss implements Subject {
    @Getter
    @Setter
    String state;
    EventHandeler eventHandeler;

    public Boss(EventHandeler eventHandeler) {
        this.eventHandeler = eventHandeler;
    }

    @Override
    public void notifyObservers() throws Exception {
        eventHandeler.notifyEvents();
    }
}
