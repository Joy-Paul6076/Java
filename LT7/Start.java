public class Start {
    public static void main(String[] args) {
     
        BookShop shop = new BookShop("AIUB Campus Bookstore");

        StoryBook sb1 = new StoryBook("SB-001", "The Alchemist", "Paulo Coelho", 12.50, 20, "Fiction");
        
        StoryBook sb2 = new StoryBook();
        sb2.setIsbn("SB-002");
        sb2.setBookTitle("1984");
        sb2.setAuthorName("George Orwell");
        sb2.setPrice(15.00);
        sb2.setAvailableQuantity(15); 
        sb2.setCategory("Dystopian"); 
       
        TextBook tb1 = new TextBook("TB-001", "Java: The Complete Reference", "Herbert Schildt", 45.00, 50, 1);
        
        
        TextBook tb2 = new TextBook();
        tb2.setIsbn("TB-002");
        tb2.setBookTitle("Data Structures");
        tb2.setAuthorName("Mark Allen Weiss");
        tb2.setPrice(55.00);
        tb2.setAvailableQuantity(40); 
        tb2.setStandard(2); 

        
        System.out.println("\nINSERTING BOOKS");
        shop.insertBook(sb1);
        shop.insertBook(sb2);
       
        shop.insertBook(tb1);
        shop.insertBook(tb2);
       
        System.out.println("4 books successfully inserted into the shop.");

        shop.showAllBooks();

        System.out.println("\nSelling 5 copies of 'The Alchemist'");
        sb1.sellQuantity(5);

        System.out.println("\nAdding 10 copies to 'The Alchemist'");
        sb1.addQuantity(10);

        System.out.println("\nSearching for ISBN 'TB-001':");
        Book foundBook = shop.searchBook("TB-001");
        if (foundBook != null) {
            System.out.println("Book Found!");
            foundBook.showDetails();
        } else {
            System.out.println("Book not found.");
        }

  
        System.out.println("\nRemoving 'The Alchemist' (SB-001) from the shop");
        boolean isRemoved = shop.removeBook(sb1);
        if (isRemoved) {
            System.out.println("Book successfully removed.");
        } else {
            System.out.println("Failed to remove book.");
        }

        shop.showAllBooks();
    }
}