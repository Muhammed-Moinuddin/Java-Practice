//instead creating from scratch, we are using java collection to use linkedlist
import java.util.*;

public class LLcollection {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());
        list.remove();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            //if(list.get(i) == value)
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        list.remove(0);
        System.out.println(list);
    }
}
