package p5.factory.factory;

import p5.factory.leifeng.LeiFeng;
import p5.factory.leifeng.Volunteer;

public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
