abstract class Animal {
    abstract void walk();
    public void eat(){
        System.out.println("Animal Eats");
    }
    Animal(){
        System.out.println("You are creating a new Animal");
    }
}

interface Plants{
    String color = "green";
    void breath();
}

interface Flowers{
    
}

class Rose implements Plants, Flowers{
    public void breath(){
        System.out.println("Uses oxygen to breath");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Test {
    public static void main(String args[]){
        Horse horse1 = new Horse();
        horse1.walk();
        horse1.eat();
    }
}
