public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    
    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
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

    public boolean isAvailable() {
        return availability;
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

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    
    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book '" + title + "' has been borrowed successfully.");
            return true;
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
            return false;
        }
    }

    
    public void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("Book '" + title + "' has been returned successfully.");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        
        LibraryBook book1 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        System.out.println("Book 1:");
        book1.displayInfo();
        
        System.out.println();
        
        
        book1.borrowBook();
        System.out.println("\nAfter borrowing:");
        book1.displayInfo();
        
        System.out.println();
        
        
        book1.borrowBook();
        
        System.out.println();
        
        
        book1.returnBook();
        System.out.println("\nAfter returning:");
        book1.displayInfo();
    }
}
