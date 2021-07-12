package p9.builder.builder;

import p9.builder.Product;

/**
 * 具体建造类2
 */
public class ConcreteBuilder2 implements MyBuilder{

    private Product product = new Product();

    public void buildA() {
        product.add("部件X");
    }

    public void buildB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
