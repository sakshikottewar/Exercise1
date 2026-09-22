import java.util.Scanner;

public class stack {

    int[] stack = new int[5];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Element pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        stack s = new stack();

        while (true) {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Program ended");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}