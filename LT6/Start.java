public class Start {
    public static void main(String[] args) {
     
        BookShop shop = new BookShop("AIUB Campus Bookstore");

        System.out.println("CREATING BOOKS");

        StoryBook sb1 = new StoryBook("SB-001", "The Alchemist", "Paulo Coelho", 12.50, 20, "Fiction");
        StoryBook sb2 = new StoryBook("SB-002", "Dune", "Frank Herbert", 18.00, 15, "Sci-Fi");
        StoryBook sb3 = new StoryBook("SB-003", "1984", "George Orwell", 10.00, 30, "Dystopian");
        
    

        StoryBook sb5 = new StoryBook("SB-005", "Frankenstein", "Mary Shelley", 8.50, 25, "Horror");

        TextBook tb1 = new TextBook("TB-001", "Java: The Complete Reference", "Herbert Schildt", 45.00, 50, 1);
        TextBook tb2 = new TextBook("TB-002", "Data Structures", "Mark Allen Weiss", 55.00, 40, 2);
        TextBook tb3 = new TextBook("TB-003", "Operating Systems", "Silberschatz", 65.00, 35, 3);
        
        TextBook tb4 = new TextBook();
        tb4.setIsbn("TB-004");
        tb4.setBookTitle("Computer Networks");
        tb4.setAuthorName("Kurose & Ross");
        tb4.setPrice(70.00);
        tb4.setAvailableQuantity(20);
        tb4.setStandard(4);

        TextBook tb5 = new TextBook("TB-005", "Database System Concepts", "Korth", 60.00, 15, 3);

        System.out.println("\nINSERTING BOOKS");
        shop.insertBook(sb1);
        shop.insertBook(sb2);
        shop.insertBook(sb3);
        shop.insertBook(sb5);
        shop.insertBook(tb1);
        shop.insertBook(tb2);
        shop.insertBook(tb3);
        shop.insertBook(tb4);
        shop.insertBook(tb5);
        System.out.println("10 books successfully inserted into the shop.");

        
        shop.showAllBooks();

    
        System.out.println("\nSelling 5 copies of 'The Alchemist'");
        sb1.sellQuantity(5);

        System.out.println("\nAdding 10 copies to 'Data Structures'");
        tb2.addQuantity(10);

        
        System.out.println("Searching for ISBN 'TB-003':");
        Book foundBook = shop.searchBook("TB-003");
        if (foundBook != null) {
            System.out.println("Book Found!");
            foundBook.showDetails();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("Removing '1984' (SB-003) from the shop");
        boolean isRemoved = shop.removeBook(sb3);
        if (isRemoved) {
            System.out.println("Book successfully removed.");
        } else {
            System.out.println("Failed to remove book.");
        }

         shop.showAllBooks();
    }
} 