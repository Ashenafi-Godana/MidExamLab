package Question3;
import Question2.Stack;

public class QueueUsingStack {

        Stack input;
        Stack output;
    
        public void QueueUsingStack() {
            input = new Stack(4);
            output = new Stack(4);
        }
    
        public void enqueue(int x) {
            input.push(x);
        }
    
        public int dequeue() {
            peek();
            return output.pop();
        }
    
        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }
    
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        public static void main(String[] args) {
            QueueUsingStack numbers = new QueueUsingStack();
            numbers.enqueue(10);
            numbers.enqueue(20);
            numbers.enqueue(30);
            numbers.enqueue(40);

            
            
        }
}
