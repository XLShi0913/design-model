package p10.observer.normal.subject;

import p10.observer.normal.observer.Observer;

/**
 * 抽象通知者
 */
public interface Subject {

    void attach(Observer observer);

    void dettach(Observer observer);

    void notifyObservers();

    String getSubjectState();

    void setSubjectState(String state);

}
