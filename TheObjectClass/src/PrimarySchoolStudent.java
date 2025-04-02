public class PrimarySchoolStudent extends Student {

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
