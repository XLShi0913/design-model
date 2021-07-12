package p9.builder.builder;

import p9.builder.Product;

/**
 * 具体建造类1
 */
public class ConcreteBuilder1 implements MyBuilder {

    private Product product = new Product();

    public void buildA() {
        product.add("部件A");
    }

    public void buildB() {
        product.add("部件B");
    }

    public Product getResult() {
        return product;
    }

}
