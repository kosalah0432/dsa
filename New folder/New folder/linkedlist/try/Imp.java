public class Imp{
    Node head;

    class Node{
        int data;
        Node next;
    Node(int val)
        {
            data=val;
            next=null;
        }
    }

    public Imp(){
        head=null;
    }

    public void  insertAtBeginning(int val)
    {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +"  ");
            temp=temp.next;
        }
    }
    public void insertAtposition(int pos,int val){
        
        if(pos==0){
            insertAtBeginning(val);
        }
        else{
            Node newNode=new Node(val);
            
        }
    }
}
