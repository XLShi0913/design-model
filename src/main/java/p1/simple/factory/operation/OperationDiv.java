package p1.simple.factory.operation;

public class OperationDiv extends Operation{
    public double getResult() {
        if (numberB == 0) {
            System.out.println("错误：除数为0");
            return 0;
        } else {
            return numberA / numberB;
        }
    }
}
