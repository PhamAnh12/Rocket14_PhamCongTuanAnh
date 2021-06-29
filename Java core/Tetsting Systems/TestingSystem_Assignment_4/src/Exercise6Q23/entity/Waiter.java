package Exercise6Q23.entity;

public class Waiter extends  User{
    public Waiter(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return super.getSalaryRatio()*220;
    }
}
