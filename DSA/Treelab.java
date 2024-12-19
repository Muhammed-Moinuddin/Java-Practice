// This class represents a single node in the binary tree
class TreeNode {
    int value;           // Value of the node
    TreeNode left;       // Left child of the node
    TreeNode right;      // Right child of the node

    // Constructor: Create a node with a specific value
    TreeNode(int value) {
        this.value = value; // Assign the value to the node
        this.left = null;   // Initially, no left child
        this.right = null;  // Initially, no right child
    }
}

// This class represents the binary tree and its operations
class BinaryTree {
    TreeNode root; // Root of the tree (starting point)

    // Constructor: Creates an empty tree (no nodes)
    BinaryTree() {
        this.root = null; // Tree starts with no nodes
    }

/*     

In the insert method, the while (true) loop is used to traverse the binary tree until a suitable position for the new value is found. The loop ensures continuous traversal until one of the following conditions is met:

The correct position is found:

If the left or right child of the current node is null, a new TreeNode is created, and the loop breaks using break.
The value is already in the tree:

If the value equals current.value, the loop also breaks because duplicates are not allowed. 


*/


    // **INSERT OPERATION**
    // Method to add a value to the tree
    void insert(int value) {
        if (root == null) {
            // If the tree is empty, create a new node as the root
            root = new TreeNode(value);
        } else {
            // Start from the root and find the correct position
            TreeNode current = root;
            while (true) {
                if (value < current.value) {
                    // If the value is smaller, move to the left
                    if (current.left == null) {
                        // Found an empty spot, create a new node here
                        current.left = new TreeNode(value);
                        break;
                    } else {
                        current = current.left; // Move to the left child
                    }
                } else if (value > current.value) {
                    // If the value is larger, move to the right
                    if (current.right == null) {
                        // Found an empty spot, create a new node here
                        current.right = new TreeNode(value);
                        break;
                    } else {
                        current = current.right; // Move to the right child
                    }
                } else {
                    // If the value is equal, do nothing (no duplicates allowed)
                    break;
                }
            }
        }
    }
    // **DISPLAY OPERATION (IN-ORDER TRAVERSAL)**
    // Method to print the tree in sorted order (left -> root -> right)
    void printTree() {
        System.out.println("Tree in sorted order:");
        inOrderTraversal(root); // Start printing from the root
        System.out.println(); // Add a new line after printing
    }

    // In-order traversal integrated into the printTree method
    void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left); // Visit and print the left subtree
            System.out.print(node.value + " "); // Print the current node's value
            inOrderTraversal(node.right); // Visit and print the right subtree
        }
    }
}
// **MAIN CLASS**: To test the BinaryTree functionality
public class Treelab {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree tree = new BinaryTree();

        // Insert values into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Print the tree in sorted order
        tree.printTree(); // Output: 20 30 40 50 60 70 80
    }
}