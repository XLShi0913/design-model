package p10.observer.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 事件，即一个动态代理
 */
@Getter
@Setter
@NoArgsConstructor
public class Event {

    // 被代理对象
    private Object proxied;
    // 被代理的方法名
    private String methodName;
    // 方法的参数
    private Object[] params;
    // 方法的参数类型
    private Class<?>[] paramTypes;

    public Event(Object proxied, String methodName, Object... args) {
        this.proxied = proxied;
        this.methodName = methodName;
        this.params = args;
        contractParamType(params);
    }

    private void contractParamType(Object[] params) {
        this.paramTypes = new Class<?>[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke()
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = proxied.getClass().getMethod(methodName, paramTypes);
        method.invoke(proxied, params);
    }
}
