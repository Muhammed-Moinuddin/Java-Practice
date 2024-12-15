//By Muhammad Moinuddin (EB20102083)
class LLPractice{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void delete(int key){
        Node currNode = head;
        Node prevNode = null;

        //If head is the key
        if(currNode != null && currNode.data == key){
            head = currNode.next;
            return;
        }
        //if key not found move forward
        while (currNode != null && currNode.data != key) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(currNode == null){
            System.out.println("Value not found in the list");
            return;
        }
        //link previous node to next node leaving the current node;
        prevNode.next = currNode.next;
    }

    public static void main(String[] args) {
        LLPractice mylist = new LLPractice();
        mylist.addFirst(1);
        mylist.addLast(2);
        mylist.addLast(3);
        mylist.printList();
        mylist.delete(2);
        mylist.printList();

    }
}