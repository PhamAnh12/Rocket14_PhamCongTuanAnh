package Exercise1Q1.backend;

import Exercise1Q1.entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class Mynews {
    private ArrayList<News> news;

    public Mynews() {
        news = new ArrayList<>();
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời chọn các lựa chọn:");
            System.out.println("1.Inset New");
            System.out.println("2.View New");
            System.out.println("3.Average rate");
            System.out.println("4.Exit ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Nhập vào Title");
                    String title = sc.next();
                    System.out.println("Nhập vào PublishDate");
                    String publishDate = sc.next();
                    System.out.println("Nhập vào Author");
                    String author = sc.next();
                    System.out.println("Nhập vào Content");
                    String content = sc.next();
                    System.out.println("Nhập vào đánh giá 1");
                    int rate1 = sc.nextInt();
                    System.out.println("Nhập vào đánh giá 2");
                    int rate2 = sc.nextInt();
                    System.out.println("Nhập vào đánh giá 3");
                    int rate3 = sc.nextInt();
                    int[] rates = {rate1, rate2, rate3};
                    news.add(new News(title, publishDate, author, content, rates));
                    break;

                case 2:
                    for (News new1 : news) {
                        new1.Display();
                    }
                    break;
                case  3:
                    for (News news1 : news){
                        System.out.println("Title:"+news1.getTitle() +" Đánh giá trung bình: "+ news1.Calculate());
                    }
                case 4:
                    return;
                default:
                    System.out.println("Bạn nhập sai số. Vui lồng nhập lại:");
                    Menu();
                    break;
            }
        }
    }
}
