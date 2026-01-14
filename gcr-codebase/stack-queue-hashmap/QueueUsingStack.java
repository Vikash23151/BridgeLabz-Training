import java.util.Stack;
class QueueUsingTwoStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(int x){
        stack1.push(x);
    }
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        QueueUsingTwoStack queue = new QueueUsingTwoStack();
        queue.enqueue(10);
        queue.enqueue(25);
        queue.enqueue(30);
        queue.enqueue(35);
        System.out.println(queue.dequeue());
    }
}