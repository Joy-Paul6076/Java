public class BookShop {
    private String name;
    private Book[] books;

    
    public BookShop() {
        books = new Book[100];
    }

    public BookShop(String name) {
        this.name = name;
        books = new Book[100];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean insertBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                return true;
            }
        }
        System.out.println("Cannot insert. BookShop is full.");
        return false;
    }

    public boolean removeBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsbn().equals(b.getIsbn())) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

    public void showAllBooks() {
        System.out.println("\n--- All Books in " + name + " ---");
        boolean isEmpty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].showDetails();
                System.out.println("---------------------------");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("The bookshop is currently empty.");
        }
    }

    public Book searchBook(String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }
} 