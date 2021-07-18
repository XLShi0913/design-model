package p13.adapter.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 后卫
 */
@Setter
@Getter
@AllArgsConstructor
public class Guards implements Player {
    private String name;

    @Override
    public void attack() {
        System.out.println(String.format("后卫 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("后卫 %s 防守", name));
    }
}
