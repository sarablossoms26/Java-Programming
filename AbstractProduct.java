import java.util.Scanner;

abstract class AbstractProduct {
    int productId;
    String name;
    String description;

    AbstractProduct(int productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    abstract void display();
}

class Product extends AbstractProduct {
    double price;

    Product(int productId, String name, String description, double price) {
        super(productId, name, description);
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

class Book extends Product {
    String isbn;
    String author;
    String title;

    Book(int productId, String name, String description, double price, String isbn, String author, String title) {
        super(productId, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }
}

class TravelGuide extends Book {
    String country;

    TravelGuide(int productId, String name, String description, double price, String isbn, String author, String title, String country) {
        super(productId, name, description, price, isbn, author, title);
        this.country = country;
    }

    void display() {
        super.display();
        System.out.println("Country: " + country);
    }
}

class CompactDisc extends Product {
    String artist;
    String title;

    CompactDisc(int productId, String name, String description, double price, String artist, String title) {
        super(productId, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Travel Guide Details:");
        int tgId = sc.nextInt();
        sc.nextLine();
        String tgName = sc.nextLine();
        String tgDesc = sc.nextLine();
        double tgPrice = sc.nextDouble();
        sc.nextLine();
        String isbn = sc.nextLine();
        String author = sc.nextLine();
        String bookTitle = sc.nextLine();
        String country = sc.nextLine();

        TravelGuide tg = new TravelGuide(tgId, tgName, tgDesc, tgPrice, isbn, author, bookTitle, country);

        System.out.println("Enter Compact Disc Details:");
        int cdId = sc.nextInt();
        sc.nextLine();
        String cdName = sc.nextLine();
        String cdDesc = sc.nextLine();
        double cdPrice = sc.nextDouble();
        sc.nextLine();
        String artist = sc.nextLine();
        String cdTitle = sc.nextLine();

        CompactDisc cd = new CompactDisc(cdId, cdName, cdDesc, cdPrice, artist, cdTitle);

        System.out.println("\nTravel Guide Details:");
        tg.display();

        System.out.println("\nCompact Disc Details:");
        cd.display();

        sc.close();
    }
}
