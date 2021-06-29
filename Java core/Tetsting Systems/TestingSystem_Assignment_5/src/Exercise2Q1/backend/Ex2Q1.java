package Exercise2Q1.backend;

import Exercise2Q1.entity.Student;

import java.util.ArrayList;

public class Ex2Q1 {
    private ArrayList<Student> students;
    public Ex2Q1(){
        students = new ArrayList<>();
        students.add(new Student("Nguyễn Van A",1));
        students.add(new Student("Nguyễn Van B",1));
        students.add(new Student("Nguyễn Van C",1));
        students.add(new Student("Nguyễn Van D",2));
        students.add(new Student("Nguyễn Van E",2));
        students.add(new Student("Nguyễn Van F",2));
        students.add(new Student("Nguyễn Van G",2));
        students.add(new Student("Nguyễn Van H",3));
        students.add(new Student("Nguyễn Van I",3));
        students.add(new Student("Nguyễn Van J",3));

    }
    public  void Menu(){
        for (Student st : students){
            st.diemDanh();
        }
        for (Student st : students){
            if(st.getGroup() == 1){
                st.hocBai();
            }
            if(st.getGroup() == 2){
                st.donVeSinh();
            }
        }
    }
}
