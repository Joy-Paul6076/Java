public class TextBook extends Book {
public int standard;
public TextBook(){}
public TextBook(String isbn,String bookTitle,String authorName,double price,int avaiableQuantity,int standard){
    super(isbn,bookTitle,authorName,price,avaiableQuantity);
    this.standard=standard;
}
public void setStandard(int standard){
    this.standard=standard;
}

public int getStandard(){
    return standard;
}
public void showDetails() {
        System.out.println("TextBook ISBN: " + getIsbn() + ", Title: " + getBookTitle() + ", Standard: " + standard);
    } 
}
