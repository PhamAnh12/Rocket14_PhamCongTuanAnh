package Exercise6Q23.entity;

public class Employee  extends  User{
    public Employee(String name, double salaryRatio) {
        super(name,salaryRatio);
    }

    @Override
    public double calculatePay() {
        return super.getSalaryRatio()*420;
    }
}
