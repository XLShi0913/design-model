package p10.observer.normal.subject;

import p10.observer.normal.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者1
 */
public class Boss implements Subject {

    private String state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getSubjectState() {
        return state;
    }

    @Override
    public void setSubjectState(String state) {
        this.state = state;
    }
}
