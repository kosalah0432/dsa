public class Main {
    
    Node root;

    class Node{
        int key;
        Node right,left;

        Node(int val){
            key=val;
            left=right=null;
        }
    }

    public Main(int val){
        root=new Node(val);
    }

    public void add(int val){
        root=addRecursive(root,val);
    }
    private Node addRecursive(Node root,int  val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.key){
            root.left=addRecursive(root.left, val);
        }
        else{
            root.right=addRecursive(root.right, val);
        }
        return root;
    }

    public boolean contains(int val){
        return containsRec(root,val);
    }
    private boolean containsRec(Node root,int val){
        if(root==null)
            return false;
        if(root.key==val)
            return  true;
        
        if(val<root.key)
            return containsRec(root.left, val);
        else
             return containsRec(root.right, val);
    }
    

    public static void main(String[] args) {
        Main m=new Main(12);
        System.out.println("Does the tree contain 25? " + m.contains(25));

        int[] arr={14,15,16,13,2,6,3,2,1};
        int l=arr.length;
        for(int i=0;i<l;i++){
            m.add(arr[i]);
        }
        System.out.println("Does the tree contain 25? " + m.contains(16));
    
    }
}
