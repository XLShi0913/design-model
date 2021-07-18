package p11.abstractfactory.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TableEnum {
    USER("User", "p11.abstractfactory.user."),
    DEPARTMENT("Department", "p11.abstractfactory.department.");

    private String id;
    private String packageName;
}
