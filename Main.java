public class Main{
    public static void main(String[] args){
        System.out.println("Hello Moin");
        System.out.print("Hello Ayan");
        System.out.println("Hello Shahzaib");
        System.out.println(500);
        System.out.println(50+40);
        //Comment from my end
        /*System.out.println("I'll comment it out");
        System.out.println("I'll comment it out");
        */
        String name = "Maham";
        int age = 22;
        System.out.println(age);
        int moinAge;
        moinAge = 23;
        System.out.println(moinAge);
        age = 33;
        System.out.println(age); 
        System.out.println(name);
        float myFloatNum = 5.99f;
        double myDoublenum = 6.98934567;
        System.out.println(myFloatNum);
        System.out.println(myDoublenum);
        System.out.println(name + " Ilyas");
        int x = 5, y = 6, z = 7;
        System.out.println(x+y+z);
        int a,b,c;
        a = b = c = 50; 
        //All Java variables must be identified with unique names. These unique names are called identifiers.
        int $one = 1;
        int _two = 2;
        System.out.println(a);
        System.out.println($one);
        System.out.println(_two);
        double $one_1 = $one; //type casting - widening - automattic
        System.out.println($one_1);
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        String result = 10 + " days";
        System.out.println(Math.max(4,5));
        int myAge = 24;
        boolean isEducated = true;
        if(myAge < 18){
            System.out.println("I'm a teenager");
        }
        else if(myAge > 18 && isEducated == false){
            System.out.println("I'm young and uneducated");
        }
        else {
            System.out.println("I'm young and educated");
        }
        String result2 = (myAge > 18) ? "Moin is now not kid" : "Moin is still a kid";
        System.out.println(result2);

        //Switch Statements
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
            System.out.println("Not Found");
        }
        int i = 6;
        do{
            System.out.println(i);
            i--;
        } while(i > 2);

        String[] cars={"Toyota", "Volvo", "Kia", "Mazda"};
        for(String j : cars){
            System.out.println(j);
        }
        System.out.println(cars[2]);
        cars[2] = "BYD";
        System.out.println(cars[2]);
        System.out.println(cars.length);
        int[][] myArray = {{1,2,3,4,5},{6,7,8}};
        for(int l = 0; l < myArray.length; l++){
            for(int m = 0; m < myArray[l].length; m++){
                System.out.print(myArray[l][m]);
            }
        }
        myMethod("Moin");
        System.out.println(mySum(9, 9));
        System.out.println(mySum(9.5f, 9.8f));
        Entry myObj = new Entry();
        System.out.println(myObj.x);
    }
    static void myMethod(String fname){
            System.out.println("I just got executed " + fname);
            for(int i = 0; i < 6; i++) {
                System.out.println(i);
            }
            int i = 9;
            System.out.println(i);
    }
    //Method Overloading
    static int mySum(int x, int y){
        return x+y;
    }
    static float mySum(float x, float y){
        return x+y;
    }
}