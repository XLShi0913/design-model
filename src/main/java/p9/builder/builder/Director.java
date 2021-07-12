package p9.builder.builder;

/**
 * 指挥者，建造过程逻辑
 */
public class Director {
    public void construct(MyBuilder builder) {
        builder.buildA();
        builder.buildB();
    }
}
