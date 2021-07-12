package p9.builder;

import p9.builder.builder.*;

public class P9Builder {
    public static void main(String[] args) {
        Director director = new Director();
        MyBuilder b1 = new ConcreteBuilder1();
        MyBuilder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
