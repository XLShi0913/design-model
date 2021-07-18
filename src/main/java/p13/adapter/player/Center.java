package p13.adapter.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 中锋
 */
@Setter
@Getter
@AllArgsConstructor
public class Center implements Player {
    private String name;

    @Override
    public void attack() {
        System.out.println(String.format("中锋 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("中锋 %s 防守", name));
    }
}
