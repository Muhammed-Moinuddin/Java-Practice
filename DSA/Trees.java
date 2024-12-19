import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    static class Node {
        int data;
        Node left;
        Node right;
        //Will represent single node of tree.
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        //Will take the array and return node
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            //Creation of new Node
            Node newNode = new Node(nodes[index]);
            //creatng left sub-tree
            newNode.left = buildTree(nodes);
            //creating right sub-tree
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static class BinaryTree2{
        Node root;
        BinaryTree2() {
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
    }
    
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        //preorder root
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
        levelorder(root);

        BinaryTree2 tree2 = new BinaryTree2();

        // Insert values into the tree2
        tree2.insert(50);
        tree2.insert(30);
        tree2.insert(70);
        tree2.insert(20);
        tree2.insert(40);
        tree2.insert(60);
        tree2.insert(80);
        inorder(root);
    }
}
