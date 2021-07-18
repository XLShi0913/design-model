package p10.observer.event;

/**
 * 抽象通知者
 */
public interface Subject {
    String getState();
    void setState(String state);

    void notifyObservers() throws Exception;
}
