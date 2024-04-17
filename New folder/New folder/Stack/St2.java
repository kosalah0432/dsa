import java.util.Arrays;
class StackDemo2{
    int tos, maxsize;
    int[] arr;

    StackDemo2(int maxsize) {
        this.maxsize = maxsize;
        arr = new int[maxsize];
        tos = -1;
    }

    boolean isEmpty() {
        return tos == -1;
    }

    boolean isFull() {
        return tos == maxsize - 1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            tos = tos + 1;
            arr[tos] = item;
            System.out.println(item + "  is pushed ");
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // or throw an exception
        }
        int poppedItem = arr[tos];
        tos = tos - 1;
        return poppedItem;
        
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("The top of the element is : " + arr[tos]);
        }
    }

    void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }
}



public class St2{
    public static void main(String[] args) {
        StackDemo2 s1 = new StackDemo2(4);

        System.out.println("Array is empty : " +s1.isEmpty());
        s1.push(1);
        s1.push(2);

        System.out.println("Array is empty : " +s1.isEmpty());
        s1.push(4);
        s1.push(7);
        s1.push(9);

        s1.peek();
        System.out.println("popped : " +s1.pop());
        s1.peek();
        System.out.println("popped : " +s1.pop());
        
        s1.display();
    }
}
