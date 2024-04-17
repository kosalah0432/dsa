import java.util.Scanner;
public class Stack{
	int top;
	int maxSize;
	char stackArray[];
	String word;
	
	public Stack(int s){
		top=-1;
		maxSize=s;
		stackArray=new char[maxSize];
	}
	public boolean isFull(){
		return top==maxSize-1;
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public void push(char x){
		if(isFull()){
			System.out.println("Stack is OverFlow, Stack is Full");
		}
		else{
			top=top+1;
			stackArray[top]=x;
		}
		System.out.println(x+" is pushed");
	}
	public char pop(){
		char removeItem=0;
		if(isEmpty()){
			System.out.println("Stack is UnderFlow, Stack is Empty");
		}
		else{
			removeItem = stackArray[top];
			top=top-1;
		}
		return removeItem;
	}
	public void displayData(){
		System.out.println("The Values are :");
		for(int i=top;i>=0;i--){
			System.out.print(stackArray[i]+"\t");
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
	public void revString(){
		System.out.println("The Reverse String is :");
		while(!isEmpty()){
			System.out.print(pop());
		}
	}
	
	public static void main(String[] args){
		Stack ss = new Stack(10);
		ss.insert();
		ss.revString();

        //ss.displayData();
		
	}
	
}