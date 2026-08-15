public class BookShop {
    private String name;
    private TextBook[] textBooks;
    private StoryBook[] storyBooks;

    public BookShop() {
        textBooks = new TextBook[100];
        storyBooks = new StoryBook[100];
    }

    
    public BookShop(String name) {
        this.name = name;
        textBooks = new TextBook[100];
        storyBooks = new StoryBook[100];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public boolean insertTextBook(TextBook tb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                return true;
            }
        }
        System.out.println("TextBook inventory is full.");
        return false;
    }

    public boolean removeTextBook(TextBook tb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null && textBooks[i].getIsbn().equals(tb.getIsbn())) {
                textBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public TextBook searchTextBook(String isbn) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null && textBooks[i].getIsbn().equals(isbn)) {
                return textBooks[i];
            }
        }
        return null;
    }

    public void showAllTextBooks() {
        System.out.println("\n--- All TextBooks in " + name + " ---");
        boolean isEmpty = true;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null) {
                textBooks[i].showDetails();
                System.out.println("---------------------------");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("No TextBooks available.");
        }
    }

    
    public boolean insertStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                return true;
            }
        }
        System.out.println("StoryBook inventory is full.");
        return false;
    }

    public boolean removeStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(sb.getIsbn())) {
                storyBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public StoryBook searchStoryBook(String isbn) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(isbn)) {
                return storyBooks[i];
            }
        }
        return null;
    }

    public void showAllStoryBooks() {
        System.out.println("\n--- All StoryBooks in " + name + " ---");
        boolean isEmpty = true;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null) {
                storyBooks[i].showDetails();
                System.out.println("---------------------------");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("No StoryBooks available.");
        }
    }
}