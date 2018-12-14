public class Book {

    private String name;
    private String author;
    private float price;
    private int year;
    private int lenght;

    public void setName(String text){    // setter
        this.name=text;
    }

     public void setAuthor(String author){
        this.author=author;
     }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
