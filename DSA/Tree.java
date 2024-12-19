class Node {
    int data;
    Node left; 
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    void insert(int number){
        if(root == null){
            root = new Node(number);
        } else {
            Node current = root;
            while(true){
                if(number < current.data){
                    if(current.left == null){
                        current.left = new Node(number);
                        break;
                    } else {
                        current = current.left;
                    }
                }
                else if(number > current.data){
                    if(current.right == null){
                        current.right = new Node(number);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    void printTree() {
        System.out.println("Tree in sorted order:");
        inorder(root);
        System.out.println();
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right); 
    }
}

public class Tree {
    public static void main(String[] args) {
        
        BinaryTree mytree = new BinaryTree();
        mytree.insert(25);
        mytree.insert(31);
        mytree.insert(63);
        mytree.insert(75);
        mytree.insert(30);
        mytree.insert(44);
        mytree.insert(80);
        mytree.printTree();
    }
    }
}