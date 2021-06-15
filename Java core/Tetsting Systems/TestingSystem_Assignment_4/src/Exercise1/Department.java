package Exercise1;

public class Department {
    int id;
    String name;

//    Question 1:
//Tạo constructor cho department:
//a) không có parameters

    Department(){
       this.id = 1;
       this.name ="Dev";
    }
//    b) Có 1 parameter là nameDepartment và default id của
//    Department = 0
    Department(String name){
        this.id = 0;
        this.name = name;
    }

}
