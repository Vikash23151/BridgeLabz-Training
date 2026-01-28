package scenario_based;

import java.util.Scanner;

public class StackImplementation {

    static int top = -1;   

    static void push(int[] stack, int number) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = number;
    }

    static int pop(int[] stack) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    static void peek(int[] stack) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }
    
    static void isEmpty(int[] stack) {
    	if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of stack: ");
        int size = sc.nextInt();

        int[] stack = new int[size];

        push(stack, 10);
        push(stack, 5);

        System.out.println("Popped: " + pop(stack));

        peek(stack);
        sc.close();
    }
}
