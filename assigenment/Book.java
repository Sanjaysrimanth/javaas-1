class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public Book(String title, String author) {
        this(title, author, 500, 10); 
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James Gosling", 800, 20);
        Book book2 = new Book("C Programming", "Dennis Ritchie");

        book1.displayDetails();
        System.out.println(); 
        book2.displayDetails();
    }
}
