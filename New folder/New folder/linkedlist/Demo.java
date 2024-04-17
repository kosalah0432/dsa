public class Demo{
    public static void main(String[] args) {
        
        Implementation i = new Implementation();
        i.insertAtBeginning(4);
        i.insertAtBeginning(2);
        i.insertAtBeginning(1);
        i.display();
        System.out.println();
        i.insertAtposotion(2,3);
        i.insertAtposotion(3,5);
        i.insertAtposotion(0,0);
      //  System.out.println();
        i.display();
       // i.insertAtposotion(9,9);
       i.deleteAtPosition(2);
       i.deleteAtPosition(4);
       System.out.println();
        i.display();    

        i.deleteAtBeginning();
        System.out.println();
        i.display();

        System.out.println();
       // i.deleteAtPosition(8);
        i.display();
        System.out.println();
        i.deleteAtLast();
        i.display();

        System.out.println();
        i.reverse();
        i.display();  
    }
}
