public abstract class Book implements BookOperations {
private String isbn;
private String bookTitle;
private String authorName;
private double price;
private int avaiableQuantity;
public Book(){}
public Book(String isbn,String bookTitle,String authorName,double price,int avaiableQuantity){
    this.isbn=isbn;
    this.bookTitle=bookTitle;
    this.authorName=authorName;
    this.price=price;
    this.avaiableQuantity=avaiableQuantity;
}    
public void setIsbn(String isbn){
    this.isbn=isbn;
}
public void setBookTitle(String bookTitle){
    this.bookTitle=bookTitle;
}
public void setAuthorName(String authorName){
    this.authorName=authorName;
}
public void setPrice(double price){
    this.price=price;
}
public void setAvaiableQuantity(int avaiableQuantity){
    this.avaiableQuantity=avaiableQuantity;
}
public String getIsbn(){
    return isbn;
}
public String getBookTitle(){
    return bookTitle;
}
public String getAuthorName(){
    return authorName;
}
public double getPrice(){
    return price;
}
public int getAvaiableQuantity(){
    return avaiableQuantity;
}
public void addQuantity(int amount){
    avaiableQuantity+=amount;
    System.out.println("Quantity Added Successfully");
}
public void sellQuantity(int amount){
    if(avaiableQuantity>=amount){
        avaiableQuantity-=amount;
    System.out.println("Quantity removed Successfully");
    }
    else{
        System.out.println("Enter a valid Amount");

    }
}
public abstract void showDetails();
}
