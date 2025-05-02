//package declaration is important because without it the compiled class will not run.
//you can compile this class using "javac <folder>/<className>.java"
//However you cannot run java <folder>/<className>
//You will get NoClassDefFoundError
//also, package name must match the "directory" name. i.e. Directory for Java is a Package.
package arrays;

public class Main {
    public static void main(String...args) {
        System.out.println("Testing Array class");
    }
}