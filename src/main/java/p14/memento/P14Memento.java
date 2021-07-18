package p14.memento;

public class P14Memento {
    public static void main(String[] args) {
        Role lixiaoyao = new Role("李逍遥");
        RoleStateCaretaker caretaker = new RoleStateCaretaker();

        lixiaoyao.init();
        lixiaoyao.showState();

        caretaker.setMemento(lixiaoyao.saveState());

        lixiaoyao.attack();
        lixiaoyao.showState();

        lixiaoyao.recoveryState(caretaker.getMemento());
        lixiaoyao.showState();
    }
}
