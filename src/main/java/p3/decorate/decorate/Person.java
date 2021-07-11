package p3.decorate.decorate;

public class Person {
    String name;

    public Person() { }
    public Person(String name) { this.name = name; }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
