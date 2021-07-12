package p9.builder.builder;

import p9.builder.Product;

/**
 * 抽象建造类
 */
public interface MyBuilder {

    void buildA();

    void buildB();

    Product getResult();

}
