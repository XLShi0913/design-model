package p15.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 非leaf组件
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    // 构造方法不能继承
    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtil.buildString('-', depth) + name);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
