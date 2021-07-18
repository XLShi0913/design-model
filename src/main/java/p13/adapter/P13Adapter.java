package p13.adapter;

import p13.adapter.player.Forwards;
import p13.adapter.player.Guards;
import p13.adapter.player.Player;

public class P13Adapter {
    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        Player m = new Guards("麦克格雷迪");

        Player ym = new Translator("姚明");

        b.attack();
        b.defense();
        ym.attack();
        ym.defense();
    }
}
