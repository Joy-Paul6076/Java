
public class Start {
    public static void main(String[] args) {
       
        BookShop shop = new BookShop("AIUB Campus Bookstore");

       
        StoryBook sb1 = new StoryBook("SB-001", "The Alchemist", "Paulo Coelho", 12.50, 20, "Fiction");
       
        StoryBook sb4 = new StoryBook();
        sb4.setIsbn("SB-004");
        sb4.setBookTitle("The Hobbit");
        sb4.setAuthorName("J.R.R. Tolkien");
        sb4.setPrice(15.99);
        sb4.setAvaiableQuantity(10);
        sb4.setCategory("Fantasy");

        StoryBook sb5 = new StoryBook("SB-005", "Frankenstein", "Mary Shelley", 8.50, 25, "Horror");

        
        TextBook tb1 = new TextBook("TB-001", "Java: The Complete Reference", "Herbert Schildt", 45.00, 50, 1);
       
        TextBook tb4 = new TextBook();
        tb4.setIsbn("TB-004");
        tb4.setBookTitle("Computer Networks");
        tb4.setAuthorName("Kurose & Ross");
        tb4.setPrice(70.00);
        tb4.setAvaiableQuantity(20);
        tb4.setStandard(4);

        TextBook tb5 = new TextBook("TB-005", "Database System Concepts", "Korth", 60.00, 15, 3);

        System.out.println("\n========== INSERTING BOOKS ==========");
        shop.insertStoryBook(sb1);
        shop.insertStoryBook(sb4);
        shop.insertStoryBook(sb5);
        System.out.println("3 StoryBooks successfully inserted.");

        shop.insertTextBook(tb1);
        shop.insertTextBook(tb4);
        shop.insertTextBook(tb5);
        System.out.println("3 TextBooks successfully inserted.");

        
        shop.showAllStoryBooks();
        shop.showAllTextBooks();

        System.out.println("Searching for StoryBook 'SB-002':");
        StoryBook foundStory = shop.searchStoryBook("SB-002");
        if (foundStory != null) {
            System.out.println("StoryBook Found!");
            foundStory.showDetails();
        } else {
            System.out.println("StoryBook not found.");
        }

        System.out.println("\nSearching for TextBook 'TB-003':");
        TextBook foundText = shop.searchTextBook("TB-003");
        if (foundText != null) {
            System.out.println("TextBook Found!");
            foundText.showDetails();
        } else {
            System.out.println("TextBook not found.");
        }

        System.out.println("\n========== DEMONSTRATING REMOVAL ==========");
        System.out.println("Removing 'The Hobbit' (SB-004) from the shop...");
        boolean isRemoved = shop.removeStoryBook(sb4);
        if (isRemoved) {
            System.out.println("StoryBook successfully removed.");
        } else {
            System.out.println("Failed to remove StoryBook.");
        }

        System.out.println("\n========== FINAL INVENTORY CHECK ==========");
        shop.showAllStoryBooks();
    }
}