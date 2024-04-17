
import java.util.*;
public class StackDemo{
    int tos,maxsize;
    int[] arr;
    String word;
    char stackArray[];

    StackDemo(int maxsize)
    {
        this.maxsize=maxsize;
        arr = new int[maxsize];
        tos = -1;
    }
    boolean isEmpty()
    {
        return tos==-1;
        
    }
    boolean isFull()
    {
        return  tos == maxsize-1;
    }
    //for these methods u dont need to check using isFull,isEmpty function.

    void push(int item)
    {
        if  (tos==maxsize-1)
        {
            System.out.println("Stack is full");
        }
        else{
            tos=tos+1;
            arr[tos]=item;
        }
    }
    int pop()
    {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1; // or throw an exception
        }
        int poppedItem = arr[tos];
        tos = tos - 1;
        return poppedItem;
        /* 
        m2
        tos = tos-1; 
        return arr[tos+1];
         */
        
    } 
    public void peek() {
        if (tos==-1){
            System.out.println("Empty");
        }
        else{
            System.out.println("The top of the element is : " +arr[tos]);
        }
}
    void display()
    {
        for(int i=tos;i>=0;i--)
        {
            System.out.println(arr[i] +"\t");
        }
    }
    public void insert(){
		System.out.println("Enter the Word :");
		Scanner sc=new Scanner(System.in);
		word = sc.nextLine();
		
		for(int i=0;i<word.length();i++){
			push(word.charAt(i));
		}
	}
	public void revString() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }
    
        System.out.println("The Reverse String is:");
        while (!isEmpty()) {
            char poppedChar = (char) pop();
            System.out.print(poppedChar);
        }
    }
    
    
}
