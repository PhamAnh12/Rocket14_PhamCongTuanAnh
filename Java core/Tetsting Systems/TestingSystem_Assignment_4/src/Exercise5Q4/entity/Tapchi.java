package Exercise5Q4.entity;

public class Tapchi  extends  Tailieu{
    private  int soPH;
    private int thangPH;
    public Tapchi( int idTL, String nameNXB, int soBPH, int soPH, int thangPH) {
        super(idTL, nameNXB, soBPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    @Override
    public  String toString(){
        return  super.toString() + " Só phát hành: " + soPH + " Tháng Phát hành: " + thangPH;
    }
}
