public class Circle {
    private int radius;
    Circle(){
        this(3);
    }
    Circle(int radius){
        this.radius=radius;
    }
    void displayRadius(){
        System.out.println("radius of circle: "+radius);
    }

    public static void main(String[] args) {
        // default
        Circle circle1=new Circle();
        circle1.displayRadius();

        //user provided
        Circle circle2=new Circle(5);
        circle2.displayRadius();
    }
}
