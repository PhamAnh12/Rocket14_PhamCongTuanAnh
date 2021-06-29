package Exercise2Q5.entity;

public class Phonethongminh extends  Phone{
    @Override
    public void tancongkexau() {
        System.out.println("Ném là vỡ màn ...");
    }
    public void suDung3G() {
        System.out.println("Sử dụng 3G ...");
    }
    public void chupHinh() {
        System.out.println("Chup hinh ...");
    }
}
