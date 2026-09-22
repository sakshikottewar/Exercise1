
    import java.util.Scanner;

public class queue {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    
    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println("Element inserted");
        }
    }

    
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted: " + queue[front++]);
        }
    }

    
    void peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front: " + queue[front]);
        }
    }

    
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        queue q = new queue();

        while (true) {

            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
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

