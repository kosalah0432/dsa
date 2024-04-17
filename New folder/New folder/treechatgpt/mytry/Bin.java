public class Bin{
    Node root;

    class Node{
        int key;
        Node right,left;

        public Node(int val){
            key=val;
            right=left=null;
        }
    }

    public Bin(int val){
        root=new Node(val);
    }
    
}