import java.util.Arrays;
public class Labs {
    public static void main(String[] args){
        //Labs by M.Moinuddin (EB20102083)
        q1();
        q2();
        q3();
        q4();
    }
    public static void q1(){
        //Q1: Write simple program that initialize five different strings using string literals and new keyword.
        String fname = "Muhammad";
        String lname = "Moinuddin";
        String email = "moinuddinilyas786@gmail.com";
        String semester = "8th";
        String subject = "DSA";

        String area = new String("Gulshan");
        String city = new String("Karachi");
        String province = new String("Sindh");
        String country = new String("Pakistan");
        String continent = new String("Asia");

        System.out.println("Question # 1");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Email: " + email);
        System.out.println("Semester: " + semester);
        System.out.println("Subject: " + subject);

        System.out.println("Area: " + area);
        System.out.println("City: " + city);
        System.out.println("Province: " + province);
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }
    public static void q2(){
        //Q2: Write a program to convert primitive datatype double into its respectable wrapper class.
        double primitiveDouble = 14.378d;
        Double wrapperClassDouble = primitiveDouble;
        System.out.println("Question # 2");
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Class double: " + wrapperClassDouble);
        System.out.println("Proof: " + wrapperClassDouble.getClass().getName());
    }
    public static void q3(){
        //Q3: Write a program to initialize array of size 10. Print the values then update the values at index 1 and 9.
        int[] myArray = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(Arrays.toString(myArray));
        myArray[1] = 5;
        myArray[9] = 21;
        System.out.println("Question # 3");
        System.out.println(Arrays.toString(myArray));
    }
    public static void q4() {
        //Q4: Write a program to insert two values in array of length 10. The values should be inserted at index 3 and 4.
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value1 = 100;
        int value2 = 200;
        int[] newArray = new int[originalArray.length + 2];
        for (int i = 0; i < 3; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[3] = value1;
        newArray[4] = value2;
        for (int i = 3; i < originalArray.length; i++) {
            newArray[i + 2] = originalArray[i];
        }
        System.out.println("Question # 4");
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
