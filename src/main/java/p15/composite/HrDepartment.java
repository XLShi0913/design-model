package p15.composite;

public class HrDepartment extends Company {

    public HrDepartment(String name) {
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
        System.out.println(String.format("%s 员工招聘培训管理", name));
    }
}
