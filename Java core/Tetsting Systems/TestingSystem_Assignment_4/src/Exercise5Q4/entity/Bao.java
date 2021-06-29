package Exercise5Q4.entity;

import java.util.Date;

public class Bao  extends Tailieu{
    private Date ngayPH;

    public Bao( int idTL, String nameNXB, int soBPH, Date ngayPH) {
        super(idTL, nameNXB, soBPH);
        this.ngayPH = ngayPH;
    }

    public Date getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(Date ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public String toString() {
        return super.toString() + " Ngày Phát Hành: " + ngayPH;
    }
}
