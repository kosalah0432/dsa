class Node
{
   int data;
   Node next;

   Node(int val)
   {
    data=val;
    next=null;
   }
}

class implementation{
    Node head;

    implementation()
    {
        head = null;
    }

    public  void insertAtbeginning(int val)
    {
        Node n=new Node(val);

        if(head==null){
            head=n;
        }else{
            n.next=head;
            head=n;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
}
public class Mian {
    public static void main(String[] args) {
        implementation l=new implementation();
        l.insertAtbeginning(1);
        l.insertAtbeginning(2);
        l.insertAtbeginning(3);

        l.display();
    }
}
