package p6.prototype;

public class Resume implements Cloneable{
    private String name;
    private String gender;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String gender, String age) {
        this.gender = gender;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println(name + " " + gender + " " + age);
        System.out.println(workExperience);
    }

    @Override
    protected Object clone() {
        Resume newIC = new Resume(this.name);
        newIC.setPersonalInfo(this.gender, this.age);
        newIC.workExperience = (WorkExperience) this.workExperience.clone();
        return newIC;
    }
}
