package Exercise4.Question2.entity;

public class AccountEx4 {
    private  String id;
    private  String name;
    private  int balance;
    public AccountEx4(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        return this.balance += amount;
    }
    public int debit(int amount) {
        return this.balance -= amount;
    }
    public void tranfer(AccountEx4 acc, int amount) {
        this.balance -= amount;
        acc.balance += amount;
    }
    @Override
    public  String toString(){
        return  "Id: " + this.id + " Name: " + this.name + " Balance:  " + this.balance;
    }
}
