/**
 * This class shows the basics of an Array in Java.
 * Initializing an array of predefined size.
 * Adding values to a specific index
 * Removing value from a specific index
 * Listing all values of an Array.
 * Printing a specific value from an index.
 */


//package declaration is important because without it the compiled class will not run.
//you can compile this class using "javac <folder>/<className>.java"
//However you cannot run java <folder>/<className>
//You will get NoClassDefFoundError
//also, package name must match the "directory" name. i.e. Directory for Java is a Package.
package arrays;

public class Main {

    //At the time of initialization, we are creating a String array with 5 null values.
    //This array cannot hold any non-String values
    //This array cannot hold more than 5 values. 
    private static String[] strArray = new String[5];

    /**
     * This type of array initialization creates an empty array.
     * When this array is empty, you cannot add a value to any index, not even 0.
     */
    private static int[] numArray = {};

    public static void main(String...args) {
        stringArrayStuff();
        intArrayStuff();
    }

    private static void stringArrayStuff() {
        System.out.println("Initial values:");
        listAllArrayValues(strArray);
        
        //strArray[5] = "xyz"; //This will throw a Runtime exception - ArrayIndexOutOfBoundsException since index 5 does not exist.
        strArray[2] = "John Smith";

        System.out.println("\nValues after adding something on index 2:");
        listAllArrayValues(strArray);

        System.out.println("\nValue at index 2: " + strArray[2]);

        //lets add another item to the array at a different index
        strArray[4] = "Jane Doe";

        //lets remove the value from index 2 now
        strArray[2] = null;
        System.out.println("\nValues after adding and removing more:");
        listAllArrayValues(strArray);
    }

    private static void intArrayStuff() {
        System.out.println("\nInitial values in empty num array:");
        listAllArrayValues(numArray); //this will not print anything since array length is 0, it has no values yet.
        
        //numArray[2] = 123456; //This will throw a Runtime exception - ArrayIndexOutOfBoundsException since index 2 does not exist in the empty array.
        //numArray[0] = 123456; //Even this will throw ArrayIndexOutOfBoundsException

        /**
         * So how do you add to this array?
         * You don't. This type of initialization should only be used when the values are known at the time of declaration (pre-defined).
         * You can assign a new array to the same var 'numArray' which has the value you desire, however, that is poor memory management.
         */
    }

    private static void listAllArrayValues(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + "; Value: " + array[i]);
        }
    }

    private static void listAllArrayValues(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + "; Value: " + array[i]);
        }
    }

    private static void listSubsetArrayValues(int startIndex, int endIndex) {
        //startIndex must be equal to or greater than 0
        //endIndex must be less than or equal to arrays length - 1
    }
}