public class Book3 {
    public long isbn;
    protected String title;
    private String author;

    Book3(long isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        setAuthor(author);
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
}
class EBook extends Book3 {
    EBook(long isbn, String title, String author){
        super(isbn,title,author);
    }
    public void displayBookDetails(){
        System.out.println("ISBN: "+isbn);      //public
        System.out.println("Title: "+title);    //protected
        System.out.println("Author: "+getAuthor());  //private using getter public method
    }
}
class Main2 {
    public static void main(String[] args) {
        EBook eb = new EBook(9781544512280L, "Can't Hurt Me", "David Goggins");

        eb.displayBookDetails();

        eb.setAuthor("David Goggins Always");  // modifying private author using setter
        System.out.println("Updated author: " + eb.getAuthor());
    }
}
