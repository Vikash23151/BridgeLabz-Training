public class Book {
    private String title;
    private String author;
    private int price;
    Book(){
        title="Life is Unfair";
        author="Life";
        price=0;
    }
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayBookDetails(){
        System.out.println("Book title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book price: "+price+"\n");
    }

    public static void main(String[] args) {
        //default constructor
        Book book1=new Book();
        book1.displayBookDetails();

        //parameterized constructor
        Book book2=new Book("Can't Hurt Me", "David Goggins", 300);
        book2.displayBookDetails();
    }
}
