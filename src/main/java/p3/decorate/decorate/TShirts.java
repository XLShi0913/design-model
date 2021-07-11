package p3.decorate.decorate;

/**
 * 装饰
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
