package p13.adapter.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 外籍中锋
 */
@Setter
@Getter
@AllArgsConstructor
public class ForeignCenter {
    private String name;

    public void attack() {
        System.out.println(String.format("中锋 %s 进攻", name));
    }

    public void defense() {
        System.out.println(String.format("中锋 %s 防守", name));
    }
}
