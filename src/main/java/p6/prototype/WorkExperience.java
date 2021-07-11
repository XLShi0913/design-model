package p6.prototype;

import lombok.*;

@Getter
@Setter
public class WorkExperience {
    private String workDate;
    private String company;

    @Override
    protected Object clone() {
        WorkExperience clone = new WorkExperience();
        clone.setCompany(this.company);
        clone.setWorkDate(this.workDate);
        return (Object) clone;
    }

    @Override
    public String toString() {
        return workDate + " " + company;
    }
}
