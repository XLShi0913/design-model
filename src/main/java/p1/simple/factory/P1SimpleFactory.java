package p1.simple.factory;

import p1.simple.factory.operation.Operation;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P1SimpleFactory {

    public static void main(String[] args) {
        BufferedInputStream in = new BufferedInputStream(System.in);
        Scanner sc = new Scanner(in);

        double numberA = sc.nextDouble();
        String operate = sc.next();
        double numberB = sc.nextDouble();

        Operation operation = OperationFactory.createOperation(operate);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);

        double result = operation.getResult();
        System.out.println(result);
    }

}
