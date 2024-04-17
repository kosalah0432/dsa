import java.util.*;
import java.util.Arrays;

class Both{
    int tos, maxsize;
    int[] intArr; // Integer array
    char[] charArr; // Character array
    String word;

    Both(int maxsize) {
        this.maxsize = maxsize;
        intArr = new int[maxsize];
        charArr = new char[maxsize];
        tos = -1;
    }

    boolean isEmpty() {
        return tos == -1;
    }

    boolean isFull() {
        return tos == maxsize - 1;
    }

    void pushInt(int item) {
        if (tos == maxsize - 1) {
            System.out.println("Integer Stack is full");
        } else {
            tos = tos + 1;
            intArr[tos] = item;
        }
    }

    void pushChar(char item) {
        if (tos == maxsize - 1) {
            System.out.println("Character Stack is full");
        } else {
            tos = tos + 1;
            charArr[tos] = item;
        }
    }

    int popInt() {
        if (tos == -1) {
            System.out.println("Integer Stack Underflow");
            return -1; // or throw an exception
        }
        int poppedItem = intArr[tos];
        tos = tos - 1;
        return poppedItem;
    }

    char popChar() {
        if (tos == -1) {
            System.out.println("Character Stack Underflow");
            return '\0'; // or throw an exception
        }
        char poppedItem = charArr[tos];
        tos = tos - 1;
        return poppedItem;
    }

    public void peek() {
        if (tos == -1) {
            System.out.println("Empty");
        } else {
            System.out.println("The top of the element is : " + intArr[tos]);
        }
    }

    void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.println(intArr[i] + "\t");
        }
    }

    public void insert() {
        System.out.println("Enter the Word :");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            pushChar(word.charAt(i)); // Pushing characters into charArr
            pushInt((int) word.charAt(i)); // Pushing ASCII values into intArr
        }
    }

    public void revString() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }

        System.out.println("The Reverse String is:");
        while (!isEmpty()) {
            char poppedChar = popChar();
            System.out.print(poppedChar);
        }
    }
}


public class Both2{
    public static void main(String[] args) {
        Both s1 = new Both(5);

        System.out.println(s1.isEmpty());
        s1.pushInt(1);
        s1.pushInt(2);

        System.out.println(s1.isEmpty());
        s1.pushInt(4);
        s1.pushInt(7);
        s1.pushInt(9);

        System.out.println("peek first");
        s1.peek();
        System.out.println(s1.popInt());
        System.out.println("peek second");
        s1.peek();
        System.out.println(s1.popInt());
        System.out.println(s1.popInt());

        System.out.println(Arrays.toString(s1.intArr));
        s1.display();

        s1.insert();
        s1.revString();
    }
}
