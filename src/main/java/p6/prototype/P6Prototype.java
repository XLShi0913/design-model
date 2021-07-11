package p6.prototype;

public class P6Prototype {

    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "26");
        a.setWorkExperience("1998-2000", "xx公司");

        Resume b = (Resume) a.clone();
        b.setPersonalInfo("小菜", "20");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("1998-2006", "yy公司");

        a.display();
        b.display();
        c.display();
    }

}
