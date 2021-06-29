package Exercise4.Question1.backend;

import Exercise4.Question1.entity.Student;

public class Ex4Q1 {
    public  void  showStudent(){

        Student st1 = new Student("Nguyen Van A","HN");
        st1.AddScore(3f);
        Student st2 = new Student("Nguyen Van B","HN");
        st2.AddScore(4f);
        Student st3 = new Student("Nguyen Van C","HN");
        st3.AddScore(7f);
        Student st4 = new Student("Nguyen Van D","HN");
        st4.AddScore(9f);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);

    }
}
