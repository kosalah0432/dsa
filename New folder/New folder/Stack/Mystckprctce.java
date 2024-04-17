import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class InnerMystckprctce{
    int top,i,max;
    int[] arr;

    InnerMystckprctce(int max)
    {
        this.max=max;
        arr=new int[max];
        top=-1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    boolean isFull()
    {
        return top==max-1;
    }
    public void push(int number)
    {
        if(top == max-1)
        {
            System.out.println("Stack is Full");
        }
        else{
            top=top+1;
            arr[top]=number;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{ 
            int value=arr[top];
            top=top-1;
            System.out.println("The popped element value is :" +value);
        }
    }
    public void peek()
    {
        System.out.println(arr[top]);
    }
    public void display()
    {
        if (top == -1) {
            System.out.println("Stack is empty");
          } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
              System.out.print(arr[i] + " ");
            }
            System.out.println();
          }
      
    }
    
}
public class Mystckprctce {
     public static void main(String[] args) {
        
        InnerMystckprctce in =new InnerMystckprctce(4);
        System.out.println(in.isEmpty());
        System.out.println(in.isFull());

        in.push(4);
        in.push(5);
        in.peek();
        in.push(3);
        in.push(7);
        in.push(1);
        System.out.println("\nElements after push operation:");
        in.display();
        System.out.println();
        in.pop();
        
        System.out.println();
        in.display();
       
    }
}
