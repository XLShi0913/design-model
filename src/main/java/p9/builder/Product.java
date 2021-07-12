package p9.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    protected List<String> properties;

    public Product() {
        properties = new ArrayList<>();
    }

    public void add(String property) {
        properties.add(property);
    }

    public void show() {
        for (String property : properties) {
            System.out.println(property);
        }
    }
}
