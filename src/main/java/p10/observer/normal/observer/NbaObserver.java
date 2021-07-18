package p10.observer.normal.observer;

import lombok.AllArgsConstructor;
import p10.observer.normal.subject.Subject;

/**
 * 观察者1
 */
@AllArgsConstructor
public class NbaObserver implements Observer {

    private String name;
    private Subject subject;

    @Override
    public void update() {
        System.out.println(subject.getSubjectState() + " " + name + " 关闭NBA，继续工作！");
    }
}
