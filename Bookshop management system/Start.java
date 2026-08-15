public class Start {
    public static void main(String[] args) {
        BookShop shop = new BookShop("AIUB Library");

        Book b1 = new StoryBook("jp", "java", "sifat", 350, 5,"java");
        Book b5 = new TextBook("jpj", "javac", "abusifat", 450, 6,8);
        Book b2 = new TextBook("jp3", "python", "joy", 360, 7,9);
        Book b3 = new TextBook("jp2", "c++", "mehtab", 350, 5,9);
        Book b4 = new TextBook("jp12", "javascript", "sifat", 350, 5,9);

        shop.insertBook(b1);
        shop.insertBook(b4);
        shop.insertBook(b2);
        shop.insertBook(b3);
        shop.insertBook(b5);

        shop.showAllBooks();
        Book b = shop.searchBook("jp"); 
        
        if (b != null) {
            b.addQuantity(5);
            System.out.println("New Quantity: " + b.getAvaiableQuantity());
        } else {
            System.out.println("Book not found!");
        }
    }
}