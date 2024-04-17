public class BinaryTree {
    private Node root;

    private static class Node {
        int key;
        Node left, right;

        public Node(int val) {
            key = val;
            left = right = null;
        }
    }

    public BinaryTree(int val) {
        root = new Node(val);
    }

    public void add(int val) {
        root = addRecursive(root, val);
    }

    private Node addRecursive(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.key) {
            root.left = addRecursive(root.left, val);
        } else {
            root.right = addRecursive(root.right, val);
        }
        return root;
    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.key + " ");
            inOrderRecursive(root.right);
        }
    }

    public boolean contains(int val) {
        return containsNodeRecursive(root, val);
    }

    private boolean containsNodeRecursive(Node root, int val) {
        // If the current node is null, the value cannot be found
        if (root == null)
            return false;
    
        // If the value of the current node matches the given value, return true
        if (root.key == val)
            return true;
    
        // If the value is less than the current node's value, search in the left subtree
        if (val < root.key)
            return containsNodeRecursive(root.left, val);
        // If the value is greater than the current node's value, search in the right subtree
        else
            return containsNodeRecursive(root.right, val);
    }
    

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }
    
    private Node deleteRecursive(Node root, int key) {
        if (root == null) {
            return null;
        }
    
        if (key < root.key) {
            root.left = deleteRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRecursive(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
    
            // Node with two children
            root.key = minValue(root.right);
            root.right = deleteRecursive(root.right, root.key);
        }
    
        return root;
    }
    
    private int minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.key;
    }
    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }
    
    private void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }
    
    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }
    
    private void postOrderRecursive(Node root) {
        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.key + " ");
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(50);

        int[] arr={16,14,18,3,25,37,9};
        int n=arr.length;

        for(int i=0;i<n;i++){
            tree.add(arr[i]);
        }

        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println();

        System.out.println("Does the tree contain 25? " + tree.contains(25));
        System.out.println("Does the tree contain 35? " + tree.contains(35));
        System.out.println();
        tree.delete(3);
       
        tree.delete(25);
        tree.delete(50);
        System.out.println("In-order traversal after deleting 25:");
        tree.inOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
    }
}
