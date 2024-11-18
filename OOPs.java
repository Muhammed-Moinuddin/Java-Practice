import java.util.*;
import bank.*;  

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void penColor(){
        System.out.println(color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Non=Parametarized Constructor
    // Student(){
    //     System.out.println("Constructor called");
    // }

    //Parametarized constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){
            
    }

    public void printDetail(String name){
        System.out.println(name);
    }
    public void printDetail(int age){
        System.out.println(age);
    }
    public void printDetail(String name, int age){
        System.out.println(name + " " + age);
    }
}

class Shape{
    String color;

    public void area(){
        System.out.println("Display area");
    }
}
//single level
class Triangle extends Shape{
    int corners;
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}
//multi-level
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.142*r*r);
    }
}

public class OOPs {
    public static void main(String[] args){
        Pen myPen = new Pen();
        myPen.color = "Blue";
        myPen.type = "gel";
        myPen.write();

        Pen myPen2 = new Pen();
        myPen2.color = "Red";

        myPen2.penColor();
        myPen.penColor();

        //Parametarized constructor
        // Student s1 = new Student("Moin", 24);
        Student s1 = new Student();
        s1.name = "Moin";
        s1.age = 23;
 
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();

        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.corners = 3;
        System.out.println(t1.color + " " + t1.corners);

        bank.Account myAccount = new bank.Account();
        myAccount.name = "moin";
    }
}
