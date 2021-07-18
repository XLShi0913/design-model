package p11.abstractfactory;

import p11.abstractfactory.department.IDepartment;
import p11.abstractfactory.user.IUser;

import static p11.abstractfactory.constant.DatabaseTypeEnum.*;
import static p11.abstractfactory.constant.TableEnum.*;

/**
 * 利用反射实现的抽象工厂
 */
public class DataAccess {
    private static final String db = SQLSERVER.getId();

    public static IUser createIUser() throws Exception {
        // 组装类名
        String className = USER.getPackageName() + db + USER.getId();
        Class<?> iUserClass = Class.forName(className);
        return (IUser)iUserClass.getDeclaredConstructor().newInstance();
    }

    public static IDepartment createDepartment() throws Exception {
        String className = DEPARTMENT.getPackageName() + db + DEPARTMENT.getId();
        Class<?> iDepartmentClass = Class.forName(className);
        return (IDepartment)iDepartmentClass.getDeclaredConstructor().newInstance();
    }
}
