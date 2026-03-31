public class Book2 {
    private String title;
    private String author;
    private int price;
    private boolean availability;
    Book2(){
        title="Life is Unfair";
        author="Life";
        price=0;
        availability=true;
    }
    Book2(String title, String author, int price, boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    Book2(Book2 previousBook){
        this.title=previousBook.title;
        this.author= previousBook.author;
        this.price= previousBook.price;
        this.availability= previousBook.availability;
    }
    void displayBookDetails(){
        System.out.println("Book title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book price: "+price);
        System.out.println("Book Availability: "+availability);
        System.out.println();
    }
    void borrowBook(){
        if(availability){
            System.out.println("You can borrow the book");
            displayBookDetails();
            availability=false;
        }else{
            System.out.println("You cannot borrow book, it's not available");
        }
    }

    public static void main(String[] args) {
        //default constructor
        Book2 book1=new Book2();
        book1.displayBookDetails();

        //parameterized constructor
        Book2 book2=new Book2("Can't Hurt Me", "David Goggins", 300, true);
        book2.displayBookDetails();

        // copy constructor
        Book2 book3=new Book2(book2);
        book3.displayBookDetails();
        //method to borrow
        book3.borrowBook();
        book3.borrowBook();
    }
}
