import java.util.*;

public class Hashing {
    public static void main(String args[]){
        //Creating Hashset
        HashSet<Integer> set = new HashSet<>();

        //Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        //below will work but there will be only one instance, means no duplicate as it is SET
        set.add(1);

        //Search-contains
        if(set.contains(1)){
            System.out.println("Have 1");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 is deleted");
        }

        System.out.println("Set size is " + set.size());
        System.out.println("All elements are " + set);

        //Special Iterator to traverse
        Iterator it = set.iterator();
        //hasNext, next
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Creating HashMap
        //country(key) => population(value)
        HashMap<String, Integer> hashmap = new HashMap<>();

        //Insertion
        hashmap.put("Pakistan", 24);
        hashmap.put("India", 120);
        hashmap.put("China", 150);
        System.out.println(hashmap);
        hashmap.put("China", 180);
        System.out.println(hashmap);

        //Search - Lookup
        if(hashmap.containsKey("Pakistan")){
            System.out.println("Yes, it exists");
        } else {
            System.out.println("nothing exists");
        }
        System.out.println(hashmap.get("India"));
        System.out.println(hashmap.get("Indonesia"));

        int myArr[] = {2,4,6};
        for(int val : myArr){
            System.out.println(val);
        }

        //Special looping
        for(Map.Entry<String, Integer> e: hashmap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys= hashmap.keySet();
        for(String key : keys){
            System.out.println(key + ":" + hashmap.get(key));
        }

        //Removing any pair
        hashmap.remove("India");
        System.out.println(hashmap);
    }
}
