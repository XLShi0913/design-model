package p11.abstractfactory.user;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表增加一条数据");
    }

    @Override
    public User get(int id) {
        System.out.println("在Access中依据ID查一条记录");
        return null;
    }
}
