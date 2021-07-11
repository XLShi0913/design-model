package p3.decorate.decorate;

/**
 * 最基础的装饰器，装饰的起点
 */
public class Finery extends Person {

    protected Person component; // 对父类对象的引用(上文)

    public void decorate(Person component) { // 接上下文的方法
        this.component = component;
    }

    public void show() {  // 装饰方法
        if (component != null) {
            component.show();
        }
    }

}
