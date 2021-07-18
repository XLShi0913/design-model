package p10.observer.event;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NbaObserver {
    String name;
    Subject subject;

    public void closeNbaDirectSeeding() {
        System.out.println(subject.getState() + " " + name + " 关闭NBA直播，开始工作！");
    }
}
