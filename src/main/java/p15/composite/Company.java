package p15.composite;

/**
 * 抽象组件
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c); // 添加子节点
    public abstract void remove(Company c); // 删除子节点
    public abstract void display(int depth); // 树形结构打印
    public abstract void lineOfDuty(); // 履行职责
}
