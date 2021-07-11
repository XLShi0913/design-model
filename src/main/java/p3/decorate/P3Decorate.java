package p3.decorate;

import p3.decorate.decorate.*;

/**
 * 主类
 */
public class P3Decorate {
    public static void main(String[] args) {
        Person person = new Person("蜘蛛侠");

        TShirts tShirts = new TShirts();
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();

        System.out.println("第一种装扮");

        // 链式结结构
        tShirts.decorate(person);
        sneakers.decorate(tShirts);
        bigTrouser.decorate(sneakers);
        bigTrouser.show();

    }
}
