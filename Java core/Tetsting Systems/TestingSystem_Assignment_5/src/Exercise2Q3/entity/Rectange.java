package Exercise2Q3.entity;

public class Rectange {
    private Float a;
    private Float b;

    public Float tinhChuvi() {
        return 2 * (a + b);
    }

    public Float dienTich() {
        return a * b;
    }

    public Rectange(Float a, Float b) {
        super();
        this.a = a;
        this.b = b;

    }
}
