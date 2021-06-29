package Exercise5Q1Q2.entity;

public class Staff {
    private  String name;
    private  int  age;
    private  String address;
    private  Gender gender;
    public  enum  Gender{
        MALE, FEMALE, UNKNOWN
    }
    public  Staff(){

    }
    public Staff(String name, int age, Gender gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Staff [name=" + name + ", age=" + age + ", gender=" +
                gender + ", address=" + address + "]";
    }

}
