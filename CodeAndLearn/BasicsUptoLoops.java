/* For naming a class and methods certain conditions are used -
    -> PascalNamingConvention for classes
    -> camelNamingConvention for methods and variables
*/
// Open brace "{" appears at the end of the same line as the declaration statement
// No space between a method name and the parenthesis "(" starting its parameter list

/* To execute the java program, we use the following commands -
    $ javac Class_Name.java
        Now the compiled file is platform independent which means it can be run on any OS with JRE
    $ java Class_Name
        Now it is converted to Java byte code
*/

// Java uses UNICODE not ASCII

import java.util.Arrays; // For converting array to string
import java.util.Date; // For the Date class
import java.util.Scanner;// Used to take in input from the user  throught the input stream

// An access modifier allows us to define the scope or how other parts of your code or even some else's code can access this code

// Every JRE has a JVM(Java Virtual Machine) which converts the Java byte code to the native code
// A class is a container for related functions. We use a class keyword to define a class with name following it
class BasicsUptoLoops {
    // Now the Scanner class can be used anywhere within the class
    static Scanner input = new Scanner(System.in);

    // A method is a block of code which may return a value
    // A method is also a collection of statements that performs an operation.
    // The following method is called the main method which is the entry point of any Java code
    public static void main(String[] args) {
        //Dont declare multiple variables in one line
        System.out.println("Cyka Blyat");
        Date now = new Date();
        System.out.println(now);
        
        int[] arr = new int[4];
        arr[3] = 69;
        System.out.println(Arrays.toString(arr)); // Used to convert the array to string making it easier to print
        
        int[][] arrMulti = new int[2][4];
        arrMulti[1][3] = 69;
        System.out.println(Arrays.deepToString(arrMulti)); // Used to convert a multidimentinal array to string
        
        // To make a variable a constant use the keyword final
        // As a convention, capitalize the variable name if they are constants
        final float PI = 3.14F;

        // Variables are a way to store information in out computer. They are accessed by their name defined which are stored in the RAM
        int x = 1;
        int y = x++;
        System.out.println(x+"\t"+y); // output will be 2  1
        y = ++x;
        System.out.println(x+"\t"+y); // outpur will be 3   3

        // Implicit casting
        // byte>short>int>long>float>double
        short shortValue = 1;
        int intValue = 1 + shortValue;

        // Explicit casting
        double doubleValue = 12.34;
        intValue = 1 + (int)doubleValue;

        // Math.random returns value equal to or greater than 0.0 and less than 1.0
        /* To generate numbers between 0 to n
            Math.random()*n;
        */
        /* To generate numbers between min to max
            Math.random()*max + min
        */

        // byte occupies 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted Min Value = " + (myMinByteValue - 1)); // Underflow
        System.out.println("Busted Max Value = " + (myMaxByteValue + 1)); // Overflow

        // short occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted Min Value = " + (myMinShortValue - 1));
        System.out.println("Busted Max Value = " + (myMaxShortValue + 1));

        // int occupies 32 bits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        int readNumber = 123_333; // Underscore doesnt affect the value but just makes to more readable

        // long occupies 64 bits
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted Min Value = " + (myMinLongValue - 1));
        System.out.println("Busted Max Value = " + (myMaxLongValue + 1));

        long denoteLong = 45L; // Use the suffix L to denote its long datatype

        // float occupies 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        float denoteFloat = 6.9F; // Use the suffix F to dentore its float datatype

        // double occupies 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        // char occupies 16 bits
        char poundSign = '\u00A3';

        // boolean doesnt treat 1 or 0 as true or false. Boolean is a data type with only true or false
        // Note: true or false aren't strings, they are boolean literals

        // ternary operator
        boolean isEighteenOrAbove = 19>=18 ? true:false;

        /* The input.nextInt method doesnt read teh newline character in your input created by hitting "Enter"
           and so the call to input.nextLine returns after reading that newline.*/
        // One will encounter the similar behaviour when you use input.nextLine after input.next() or any input.nextFoo (apart from input.nextLine)
        int age = input.nextInt();
        input.nextLine(); // handles next line character when the enter key is pressed
        int name = input.nextLine();
    }
}