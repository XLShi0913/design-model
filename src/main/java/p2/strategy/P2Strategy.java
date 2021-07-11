package p2.strategy;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P2Strategy {
    public static void main(String[] args) {
        BufferedInputStream in = new BufferedInputStream(System.in);
        Scanner sc = new Scanner(in);

        String strategy = sc.next();
        double money = sc.nextDouble();

        CashContext context = new CashContext(strategy);
        double result = context.getResult(money);
        System.out.println(result);
    }
}
