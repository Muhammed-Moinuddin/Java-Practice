public class Entry{
    int x = 5;
    public static void main(String[] args){
        Entry myObj = new Entry();
        Entry myObj2 = new Entry();
        System.out.println(myObj.x);
        myObj.x = 19;
        System.err.println(myObj.x);
        System.out.println(myObj2.x);
    }
}