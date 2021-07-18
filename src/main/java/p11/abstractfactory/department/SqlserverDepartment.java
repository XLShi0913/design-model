package p11.abstractfactory.department;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("向SQLServer中插入一条数据");
    }

    @Override
    public Department get(int id) {
        System.out.println("从SqlServer中通过ID查一条数据");
        return null;
    }
}
