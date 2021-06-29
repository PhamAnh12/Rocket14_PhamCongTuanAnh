package Exercise5Q1Q2.backend;

import Exercise5Q1Q2.entity.Employee;
import Exercise5Q1Q2.entity.Engineer;
import Exercise5Q1Q2.entity.Staff;
import Exercise5Q1Q2.entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class QLStaff {
    private ArrayList<Staff> staffList;
    private Scanner sc;

    public QLStaff() {
        staffList = new ArrayList<Staff>();
        sc = new Scanner(System.in);
        Worker worker = new Worker("Nguyen Van A", 24, Staff.Gender.MALE, "Hn", 5);
        Engineer engineer = new Engineer("Nguyen Van B", 25, Staff.Gender.MALE, "Hn", "Đại Học");
        Employee employee = new Employee("Nguyen Van C", 26, Staff.Gender.FEMALE, "Hn", "123");
        staffList.add(worker);
        staffList.add(engineer);
        staffList.add(employee);
    }

    public void question1() {
    }

    public void question2() {
        menu();
    }

    public void menu() {

        while (true) {
            System.out.println("Mời lựa chọn các chức năng sau:");
            System.out.println("1.Thêm mới cán bộ.");
            System.out.println("2.Tìm kiếm theo họ tên.");
            System.out.println("3.Hiện thị thông tin về danh sách các cán bộ.");
            System.out.println("4.Nhập vào tên của cán bộ và delete cán bộ đó.");
            System.out.println("5.Thoát khỏi chương trình.");
            int numder = sc.nextInt();
            switch (numder) {
                case 1: {
                    System.out.println(" Bạn chọm thêm mới cán bộ.");
                    addStaff();
                    break;
                }
                case 2: {
                    System.out.println("Bạn tìm kiếm theo họ tên.");
                    findStaff();
                    break;
                }
                case 3: {
                    System.out.println("Hiện thị thông tin về danh sách các cán bộ.");
                    showStaff();
                    break;
                }
                case 4: {
                    System.out.println("Nhập vào tên của cán bộ và delete cán bộ đó.");
                    deleteStaff();
                    break;
                }
                case 5:
                    return;
                default: {
                    System.out.println("Mời bạn chọn đúng số.");
                    break;
                }


            }
        }
    }

    //    Thêm mới cán bộ
    public void addStaff() {
        System.out.println("Bạn lựa chọn thêm: ");
        System.out.println("1.Thêm Worker");
        System.out.println("2.Thêm Engineer");
        System.out.println("3.Thêm Employee");
        int number = sc.nextInt();
        Staff staff = inputStaff();
        switch (number) {
            case 1:
                System.out.println("Nhập Rank: ");
                int rank = sc.nextInt();
                Worker worker = new Worker(staff.getName(), staff.getAge(), staff.getGender(), staff.getAddress(), rank);
                this.staffList.add(worker);
                System.out.println("Thêm  Thành Công. ");
                break;

            case 2:
                System.out.println("Nhập Specialized: ");
                String specialized = sc.nextLine();
                Engineer engineer = new Engineer(staff.getName(), staff.getAge(), staff.getGender(), staff.getAddress(), specialized);
                this.staffList.add(engineer);
                System.out.println("Thêm  Thành Công. ");
                break;
            case 3:
                System.out.println("Nhập Task: ");
                String task = sc.nextLine();
                Employee employee = new Employee(staff.getName(), staff.getAge(), staff.getGender(), staff.getAddress(), task);
                this.staffList.add(employee);
                System.out.println("Thêm  Thành Công. ");
                break;


        }


    }

    public Staff inputStaff() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập họ tên:  ");
        String name = sc1.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc1.nextInt();
        System.out.println("Lựa chọn giới tính: ");
        System.out.println("1.MALE");
        System.out.println("2.FEMALE");
        System.out.println("3.UNKNOWN");
        Staff.Gender gender = null;
        int number = sc1.nextInt();
        switch (number) {
            case 1:
                gender = Staff.Gender.MALE;
                break;
            case 2:
                gender = Staff.Gender.FEMALE;
                break;
            case 3:
                gender = Staff.Gender.UNKNOWN;
                break;

        }
        String address = sc1.nextLine();
        Staff staff = new Staff(name, age, gender, address);
        return staff;
    }

    //    Tìm kiếm theo họ tên
    public void findStaff() {
        System.out.println("Nhập tên cần tìm kiếm: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        for (Staff staff : staffList) {
            if (staff.getName().equals(name)) {
                System.out.println(staff);
            }
        }
    }

    //    Hiện thị thông tin về danh sách các cán bộ
    public void showStaff() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }

    //    Nhập vào tên của cán bộ và delete cán bộ đó
    public void deleteStaff() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập tên cần xóa thông tin: ");
        String delName = sc1.next();
        staffList.removeIf(staff -> staff.getName().equals(delName));
        showStaff();

    }

}
