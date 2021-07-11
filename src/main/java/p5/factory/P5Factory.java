package p5.factory;

import p5.factory.factory.LeiFengFactory;
import p5.factory.factory.UndergraduateFactory;
import p5.factory.leifeng.LeiFeng;

public class P5Factory {
    public static void main(String[] args) {
        LeiFengFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();

        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
