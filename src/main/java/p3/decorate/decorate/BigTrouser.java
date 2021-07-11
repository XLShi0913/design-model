package p3.decorate.decorate;

/**
 * 装饰
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.print("垮裤 ");
        super.show();
    }
}
