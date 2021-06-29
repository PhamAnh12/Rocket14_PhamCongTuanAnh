package Exercise5Q4.entity;

public class Tailieu {
    private  int idTL;
    private String nameNXB;
    private  int soBPH;
    public  Tailieu(int idTL, String nameNXB, int  soBPH ){
        this.idTL = idTL;
        this.nameNXB = nameNXB;
        this.soBPH = soBPH;
    }

    public int getIdTL() {
        return idTL;
    }

    public void setIdTL(int idTL) {
        this.idTL = idTL;
    }

    public String getNameNXB() {
        return nameNXB;
    }

    public void setNameNXB(String nameNXB) {
        this.nameNXB = nameNXB;
    }

    public int getSoBPH() {
        return soBPH;
    }

    public void setSoBPH(int soBPH) {
        this.soBPH = soBPH;
    }
    public  String  toString(){
        return  "Mã Tài Liệu: " + idTL + " Tên nhà xuất bản: " + nameNXB + " Số Phát Hành: " + soBPH;
    }
}
