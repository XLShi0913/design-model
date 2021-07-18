package p10.observer.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventHandeler {

    /**
     * 委托方法列表
     */
    private List<Event> events;

    public EventHandeler() {
        events = new ArrayList<>();
    }

    /**
     * 添加事件
     * @param proxyed 被代理的对象
     * @param methodName 需要执行的方法
     * @param args 方法参数
     */
    public void addEvent(Object proxyed, String methodName, Object... args) {
        Event event = new Event(proxyed, methodName, args);
        events.add(event);
    }

    public void notifyEvents() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event : events) {
            event.invoke();
        }
    }

}
