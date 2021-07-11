package p2.strategy.cash;

import lombok.AllArgsConstructor;

/**
 * 打折收费
 */
@AllArgsConstructor
public class CashRebate extends CashSuper {
    private double rebate; // 打折
    
    public double acceptCash(double money) {
        return rebate * money;
    }
}
