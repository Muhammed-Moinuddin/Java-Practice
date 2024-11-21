public class LL {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //Linked List - addFirst
    Node head;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //LinkedList - addlast
    public void addLast(String data){
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

    //Print list
    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //Delete - First
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    //Delete - Last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public static void main(String[] args){
        LL list = new LL();
        //Insert, Print, Delete, Size Operations
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

    }
}
