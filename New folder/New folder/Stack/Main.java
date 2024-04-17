import java.util.Scanner;

class CustomStack {
    int top, max;
    int[] arr;
    int count=0;
    private int[] receivedChocolates;
    private int[] soldChocolates;
    private int receivedIndex;
    private int soldIndex;

    CustomStack(int max) {
        this.max = max;
        arr = new int[max];
        top = -1;
        this.receivedChocolates = new int[capacity];
        this.soldChocolates = new int[capacity];
        this.receivedIndex = 0;
        this.soldIndex = 0;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    public void push(int chocolates) {
        if (isFull()) {
            System.out.println("Stack is Full. Cannot add more boxes.");
        } else {
            top = top + 1;
            arr[top] = chocolates;
            receivedChocolates[receivedIndex++] = chocolates;
            // System.out.println("Receives a box containing " + chocolates + " chocolates");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot sell any box.");
        } else {
            int chocolates = arr[top];
            top = top - 1;
            soldChocolates[soldIndex++] = chocolates;
            
        }
    }

    public void displaySummary() {
      
        System.out.println("------------------------------------------");
        for (int i = 0; i < receivedIndex; i++) {
            System.out.println("Receives a box containing " + receivedChocolates[i] + " chocolates");
        }
        for (int i = 0; i < soldIndex; i++) {
            System.out.println("Sold box with " + soldChocolates[i] + " chocolates");
        }
       
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User input for the number of minutes
        System.out.print("Enter the number of minutes: ");
        int N = scanner.nextInt();
        System.out.println();

        CustomStack customStack = new CustomStack(N);

        // User input for the number of chocolate boxes received or sold
        for (int i = 1; i <= minutes; i++) {
            System.out.print("Minute " + i + ": ");
            int chocolates = scanner.nextInt();
            System.out.println("Chocolates received: " + chocolates);
            if (chocolates > 0) {
                stack.push(chocolates);
            }else if (chocolates==0) {
                stack.pop();
            }
            else
            {
                System.out.println("error input");
            }
        }

        System.out.println();
        System.out.println();
        stack.displaySummary();
        scanner.close();

    
        
        
    }
}
