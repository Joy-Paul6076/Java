public class Start {
    public static void main(String[] args) {
     
        BookShop shop = new BookShop("AIUB Campus Bookstore");

        StoryBook sb1 = new StoryBook("SB-001", "The Alchemist", "Paulo Coelho", 12.50, 20, "Fiction");
   
        TextBook tb1 = new TextBook("TB-001", "Java: The Complete Reference", "Herbert Schildt", 45.00, 50, 1);
       
        System.out.println("\nINSERTING BOOKS");
        shop.insertBook(sb1);
        shop.insertBook(tb1);
        System.out.println("2 books successfully inserted into the shop.");

        
        shop.showAllBooks();

    
        System.out.println("\nSelling 5 copies of 'The Alchemist'");
        sb1.sellQuantity(5);

        System.out.println("\nAdding 10 copies to 'The Alchemist'");
        sb1.addQuantity(10);

        
        System.out.println("Searching for ISBN 'TB-001':");
        Book foundBook = shop.searchBook("TB-001");
        if (foundBook != null) {
            System.out.println("Book Found!");
            foundBook.showDetails();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("Removing 'The Alchemist' (SB-001) from the shop");
        boolean isRemoved = shop.removeBook(sb1);
        if (isRemoved) {
            System.out.println("Book successfully removed.");
        } else {
            System.out.println("Failed to remove book.");
        }

         shop.showAllBooks();
    }
} 