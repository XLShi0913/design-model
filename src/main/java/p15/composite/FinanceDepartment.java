package p15.composite;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) { }

    @Override
    public void remove(Company c) { }

    @Override
    public void display(int depth) {
        System.out.println(StringUtil.buildString('-', depth) + name);

    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s 公司财务收支管理", name));
    }
}
