package Exercise1Q1.entity;

public class News implements Inews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates;
    public static int Count = 0;

    public News(String title, String publishDate, String author, String content, int[] rates) {
        Count++;
        this.id = Count;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates = rates;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRates() {
        return rates;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }

    @Override
    public void Display() {
       String st = "{ Id: " + this.id +" Title: " + this.title + "  PublishDate: "+ this.publishDate + " Author: " +this.author +  " Content: "+
               this.content + "  AverageRate: " + this.averageRate + " }";
       System.out.println(st);
    }

    @Override
    public float Calculate() {
        averageRate =(float) (rates[0] + rates[1] + rates[2])/3;
        return averageRate;
    }
}
