public class BookShop implements BookShopOperations {
    private String name;
    Book listOfBooks[]=new Book[100];

    public BookShop(){}
    public BookShop(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public boolean insertBook(Book b){
    for(int i=0;i<listOfBooks.length;i++){
    if(listOfBooks[i]==null){
        listOfBooks[i]=b;
        System.out.println("Book inserted successfully");
        return true;
        
    }
}
System.out.println("Your stock is full");
return false;
    }
public boolean removeBook(Book b){
    for(int i=0;i<listOfBooks.length;i++){
        if(b==listOfBooks[i]){
            listOfBooks[i]=null;
             System.out.println("Book removed successfully");
            return true;
            
            
           
        }
    }
    System.out.println("Book does not found");
    return false;
}
public Book searchBook(String isbn) {
        for (int i =0;i<listOfBooks.length;i++) {
            if (listOfBooks[i]== null && listOfBooks[i].getIsbn().equals(isbn)) {
                return listOfBooks[i];
            }
        }
        return null;
    
    }
public void showAllBooks(){
    for(int i=0;i<listOfBooks.length;i++){
        if(listOfBooks[i]!=null){
            listOfBooks[i].showDetails();
        }
    }
}
}

    

