package p13.adapter;

import p13.adapter.player.ForeignCenter;
import p13.adapter.player.Player;

public class Translator implements Player {

    private ForeignCenter foreignCenter;

    public Translator(String name) {
        this.foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.attack();
    }

    @Override
    public void defense() {
        foreignCenter.defense();
    }
}
