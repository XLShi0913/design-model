package p2.strategy.cash;

/**
 * 正常收费
 */
public class CashNormal extends CashSuper {

    public double acceptCash(double money) {
        return money;
    }
}
