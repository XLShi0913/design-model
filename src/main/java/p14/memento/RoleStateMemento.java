package p14.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 角色状态的存档
 */
@Getter
@Setter
@AllArgsConstructor
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;
}
