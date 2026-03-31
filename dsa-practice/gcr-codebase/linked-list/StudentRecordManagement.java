import java.util.Scanner;

class Node{
    int rollNo;
    String name;
    int age;
    char grade;
    Node next;
    Node(int rollNo, String name, int age, char grade){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
public class StudentRecordManagement {
    static Node insertAtHead(Node head,int rollNo, String name, int age, char grade){
        Node newNode=new Node(rollNo,name,age,grade);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        return newNode;
    }
    static Node insertAtTail(Node head,int rollNo, String name, int age, char grade){
        Node newNode=new Node(rollNo,name,age,grade);
        if(head==null){
            return newNode;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        return head;
    }
    static Node insertAtPosition(Node head,int pos, int rollNo, String name, int age, char grade){
        if(pos<1){
            return head;
        }
        if(pos==1){
            return insertAtHead(head,rollNo,name,age,grade);
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        Node newNode=new Node(rollNo,name,age,grade);
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.println("Roll No. "+node.rollNo+",  "+"Name: "+node.name+
                               ",  "+"Age: "+node.age+",  "+"Grade: "+node.grade);
            node = node.next;
        }
    }
    static String searchByRollNo(Node head, int rollNumber){
        Node curr=head;
        while(curr!=null){
            if(curr.rollNo==rollNumber){
                return curr.name;
            }else{
                curr=curr.next;
            }
        }
        return "Roll number not present";
    }
    static Node deleteByRollNo(Node head,int rollNumber){
        Node curr=head;
        while(curr.next!=null && curr.next.rollNo!=rollNumber){
            curr=curr.next;
        }
        if(curr.next==null){
            System.out.println("Roll Number not present");
            return head;
        }
        curr.next=curr.next.next;
        return head;
    }
    static void updateByRollNo(Node head,int rollNumber, char grade){
        Node curr=head;
        while(curr!=null && curr.rollNo!=rollNumber){
            curr=curr.next;
        }
        if(curr!=null){
            curr.grade=grade;
        }
    }

    public static void main(String[] args) {
        Node head=null;
        head=insertAtHead(head,2,"ryuga",20,'A');
        head=insertAtHead(head,1,"toji",22,'S');
        head=insertAtTail(head,3,"gojo",21,'S');
        head=insertAtPosition(head,3,4,"sukuna",25,'S');
        printList(head);
        System.out.println(searchByRollNo(head,3)); //returns student name
        System.out.println(searchByRollNo(head,5)); // roll number not found
        head=deleteByRollNo(head,6);
        updateByRollNo(head,3,'A');
        printList(head);
    }
}
