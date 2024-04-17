import java.util.Stack;
public class Stpop{
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(3);
        st.push(4);
        st.push(7);
        System.out.println("Initial stack: " +st);
        st.pop();
        System.out.println("Initial stack: " +st);
    }
    
}
