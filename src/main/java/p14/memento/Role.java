package p14.memento;

/**
 * 游戏角色
 */
public class Role {
    private String name;

    private int vit;
    private int atk;
    private int def;

    public Role(String name) {
        this.name = name;
    }

    public void init() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void attack() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public void showState() {
        System.out.println(String.format(
            "角色 %s, 生命值 %d, 攻击力 %d, 防御力 %d", name, vit, atk, def));
    }

    /**
     * 存储游戏状态
     * @return
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 从存档中恢复
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}
