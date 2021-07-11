package p1.simple.factory;

import p1.simple.factory.operation.*;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        if ("+".equals(operate)) {
            return new OperationAdd();
        } else if ("-".equals(operate)) {
            return new OperationSub();
        } else if ("*".equals(operate)) {
            return new OperationMul();
        } else if ("/".equals(operate)) {
            return new OperationDiv();
        } else {
            System.out.println("错误：不支持的运算类型");
            return null;
        }
    }
}
