package p11.abstractfactory.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  DatabaseTypeEnum {

    SQLSERVER("Sqlserver"),
    ACCESS("Access");

    private String id;
}
