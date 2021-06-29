package Exercise5Q4.entity;

public class Sach  extends  Tailieu{
    private  String nameTG;
    private  int soTrang;
    public Sach(int idTL, String nameNXB, int soBPH, String nameTG, int soTrang) {
        super(idTL, nameNXB, soBPH);
        this.nameTG = nameTG;
        this.soTrang = soTrang;
    }

    public String getNameTG() {
        return nameTG;
    }

    public void setNameTG(String nameTG) {
        this.nameTG = nameTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public  String toString(){
        return  super.toString() + " Tên tác giả: " +  nameTG + " Số trang: " + soTrang;
    }
}
