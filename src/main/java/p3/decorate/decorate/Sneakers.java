package p3.decorate.decorate;

/**
 * 装饰
 */
public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.print("破球鞋 ");
        super.show();
    }
}
