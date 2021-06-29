package Exercise5Q3.entity;

public class HighSchoolStudent  extends Student{
    private  String clazz;
    private String  desiredUniversity;
    public HighSchoolStudent(String name, int id, String classz, String desiredUniversity) {
        super(name, id);
        this.clazz = classz;
        this.desiredUniversity= desiredUniversity;
    }

    public String getClassz() {
        return clazz;
    }

    public void setClassz(String classz) {
        this.clazz = classz;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }
    @Override
    public String toString() {
        return "HighSchoolStudent{" + "id='" + super.getId() + '\'' + "name='" +
                super.getName() + '\'' + "clazz='"
                + clazz + '\'' + ", desiredUniversity='" + desiredUniversity + '\''
                + '}';
    }
}
