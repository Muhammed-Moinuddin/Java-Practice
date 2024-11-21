abstract class Animal{
    public void walk(){

    }
}

class Horse extends Animal{
    @Override
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    @Override
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class OOP {
    
}
