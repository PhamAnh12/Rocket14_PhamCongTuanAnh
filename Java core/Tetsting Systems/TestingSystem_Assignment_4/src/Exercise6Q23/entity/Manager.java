package Exercise6Q23.entity;

public class Manager  extends  User{
    public Manager(String name, double salaryRatio) {
        super(name,salaryRatio);
    }

    @Override
    public double calculatePay() {
        return super.getSalaryRatio()*520;
    }
}
