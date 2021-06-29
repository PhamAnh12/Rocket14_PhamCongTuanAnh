package Exercise4.Question1.entity;

//Question 1:
//Tạo Object Student có các property id, name, hometown, điểm học lực
//a) Tất cả các property sẽ để là private để các class khác không
//chỉnh sửa hay nhìn thấy
//b) Tạo constructor cho phép khi khởi tạo mỗi student thì người
//dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
//c) Tạo 1 method cho phép set điểm vào
//d) Tạo 1 method cho phép cộng thêm điểm
//e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
//điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
//4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
//thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
//Demo các chức năng trên bằng class ở front-end.
public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;
    public static  int COUNT = 0;
    public  Student(){
        this.id = ++COUNT;
    }
    public  Student(String name, String hometown ){
        this.id = ++COUNT;
        this.name = name;
        this.hometown = hometown;
        this.score =(float) 0;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public  void AddScore(float scoreadd){
        this.score =+scoreadd;
    }
    @Override
    public String toString() {
        String rank = null;
        if (this.score < 4.0) {
            rank = "Yếu";
        } else if (this.score < 6.0) {
            rank = "Trung Bình";
        } else if (this.score < 8.0) {
            rank = "Khá";
        }else {
            rank = "Giỏi";
        }
        return "Student [id=" + id + ", name=" + name + ", hometown=" +
                hometown + ", score=" + score + ", Xếp loại=" + rank + "]";
    }

}
