package java_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}

public class Serialization {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ryuga", "IT", 75000));
        employees.add(new Employee(102, "Gojo", "HR", 65000));
        employees.add(new Employee(103, "Toji", "Finance", 70000));

        //Serialize the list
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(employees);
            System.out.println("Employee list serialized successfully!");

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
            e.printStackTrace();
        }

        //Deserialize the list
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
           List<Employee> deserializedEmployees = (List<Employee>) ois.readObject();
            System.out.println("\nDeserialized Employees:");

            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

