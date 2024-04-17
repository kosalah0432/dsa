import java.util.Stack;
public class Stpeek{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("lion");
        stack.push("tiger");
        stack.push("parrot");
        System.out.println(stack);

        System.out.println("top is : " +stack.pop());

        int position = stack.search("lion");
        int position2 = stack.search("parrot");
        int pos3 = stack.search("Lions");

        System.out.println(position + "  " +position2);

    }
}