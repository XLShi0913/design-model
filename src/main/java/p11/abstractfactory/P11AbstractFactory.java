package p11.abstractfactory;

import p11.abstractfactory.department.IDepartment;
import p11.abstractfactory.user.IUser;

public class P11AbstractFactory {
    public static void main(String[] args) throws Exception {
        IUser iUser = DataAccess.createIUser();
        IDepartment iDepartment = DataAccess.createDepartment();

        iUser.get(11);
        iDepartment.get(11);
    }
}
