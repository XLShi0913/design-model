package p4.proxy;

import lombok.*;

/**
 * 追求者
 */
@Getter
@Setter
@AllArgsConstructor
public class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + " 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + " 送你花花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + " 送你巧克力");
    }
}
