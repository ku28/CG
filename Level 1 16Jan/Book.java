public class Book {
    private String title;
    private String author;
    private double price;

    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        
        Book book1 = new Book();
        System.out.println("Book 1 (Default Constructor):");
        book1.displayInfo();
        
        System.out.println();
        
        
        Book book2 = new Book("Java Programming", "John Doe", 49.99);
        System.out.println("Book 2 (Parameterized Constructor):");
        book2.displayInfo();
    }
}
