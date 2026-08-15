public class StoryBook extends Book {
    private String category;
    public StoryBook(){}
    public StoryBook(String isbn,String bookTitle,String authorName,double price,int avaiableQuantity,String category){
        super(isbn, bookTitle,authorName,price,avaiableQuantity);
        this.category=category;
    }
    public void setCaregory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }
    public void showDetails() {
        System.out.println("StoryBook ISBN: " + getIsbn()+ ", Title: " + getBookTitle() + ", Category: " + category);
    }
}
