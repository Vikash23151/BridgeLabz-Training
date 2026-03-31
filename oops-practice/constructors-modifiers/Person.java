public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    Person(){
        name="Jane Doe";
        age=20;
        height=180;
        weight=70;
    }
    Person(String name,int age,int height,int weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    Person(Person previousPerson){
        this.name=previousPerson.name;
        this.age= previousPerson.age;
        this.height= previousPerson.height;
        this.weight= previousPerson.weight;
    }
    void getPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println();
    }

    public static void main(String[] args) {
        // default
        Person person1=new Person();
        person1.getPersonDetails();

        // user defined
        Person person2=new Person("Ryuga",22,176,63);
        person2.getPersonDetails();

        //copy constructor
        Person person3=new Person(person2);
        person3.getPersonDetails();
    }
}
