import java.util.Arrays;
public class St1{
    public static void main(String[] args) {
        StackDemo s1 = new StackDemo(4);
        
        System.out.println(s1.isEmpty());
        s1.push(1);
        s1.push(2);

        System.out.println(s1.isEmpty());
        s1.push(4);
        s1.push(7);
        s1.push(9);

        System.out.println("peek first");
        s1.peek();
        System.out.println(s1.pop());
        System.out.println("peek second");
        s1.peek();
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        
        
        System.out.println(Arrays.toString(s1.arr));
        s1.display();

        s1.insert();
        s1.revString();
    }
}