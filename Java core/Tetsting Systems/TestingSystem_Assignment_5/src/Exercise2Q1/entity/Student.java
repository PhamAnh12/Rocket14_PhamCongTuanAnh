package Exercise2Q1.entity;

public class Student implements  IStudent{
    private  int id;
    private  String name;
    private  int group;
    public  static  int COUNT = 0;
    public  Student( String name, int group){
        COUNT++;
        this.id = COUNT;
        this.name = name;
        this.group = group;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void diemDanh() {
      System.out.println(this.name + " điểm danh.");
    }

    @Override
    public void hocBai() {
        System.out.println(this.name + " đang học bài.");
    }

    @Override
    public void donVeSinh() {
        System.out.println(this.name + " đang dọn vệ sinh");
    }
}
