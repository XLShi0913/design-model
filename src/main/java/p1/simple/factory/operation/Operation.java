package p1.simple.factory.operation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Operation {
    protected double numberA;
    protected double numberB;

    public abstract double getResult();
}
