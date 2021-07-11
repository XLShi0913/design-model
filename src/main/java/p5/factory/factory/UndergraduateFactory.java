package p5.factory.factory;

import p5.factory.leifeng.LeiFeng;
import p5.factory.leifeng.Undergraduate;

public class UndergraduateFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
