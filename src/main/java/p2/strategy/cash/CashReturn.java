package p2.strategy.cash;

import lombok.AllArgsConstructor;

/**
 * 返利收费
 */
@AllArgsConstructor
public class CashReturn extends CashSuper {
    private double moneyCondition; // 返利条件
    private double moneyReturn; // 返利金额

    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - moneyReturn;
        } else {
            return money;
        }
    }
}
