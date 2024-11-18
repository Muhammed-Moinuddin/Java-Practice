
//Encapsulation
class Student{
    private String name;
    private int age;

    //Getters & Setters for Name 
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Getters and Setters for Age
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name + "Age: " + this.age);
    }
}

class Animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
    //overloading
    public void animalIsLike(String data){
        System.out.println("Animal has " + data);
    }
    public void animalIsLike(int data){
        System.out.println("Animal has " + data + " legs");
    }
}

//Overriding
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat says meow");
    }
}


public class Checking{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Moin");
        s1.setAge(23);
        System.out.println(s1.getName());
        s1.displayInfo();

        Animal dog = new Dog();
        dog.animalIsLike(4);
        dog.makeSound();

    }
}