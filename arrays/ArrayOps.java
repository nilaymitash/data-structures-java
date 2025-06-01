/**
 * This class shows all the operations you can do on an array.
 * These are basic operations. We will NOT be sorting the arrays here. 
 * Since the arrays will not be sorted, we will not try any semi-advanced searching algorithms.
 */

package arrays;

public class ArrayOps {

    private static String[] fruits = {"apples", "bananas", "pears", "mango", null, "strawberry", null};

    public static void main(String[] args) {
        fruitFinder("bananas");
        deleteFruit("bananas");
        fruitFinder("bananas");
        addFruitAtFirst("avacados");
        fruitFinder("avacados");
        addFruitAtLast("tomatoes");
        fruitFinder("tomatoes");
    }

    private static void fruitFinder(String fruitName) {
        int fruitFoundAtIndex = findFruit(fruitName);
        if(fruitFoundAtIndex == -1) {
            System.out.println("Fruit not found");
        } else {
            System.out.println("Fruit found at: " + fruitFoundAtIndex);
        }
    }

    //find a given fruit
    /**
     * This function linearly finds the fruit.
     * The complexity is O(n)
     */
    private static int findFruit(String fruit) {
        int fruitFoundAtIndex = -1;
        for(int i = 0; i < fruits.length; i++) {
            //Note: we are not saying fruit.equalsIgnoreCase - this is because if the caller sends a null value, 
            //the method invocation on "fruit" would throw a NullPointerException. 
            if(fruits[i] != null && fruits[i].equalsIgnoreCase(fruit)) {
                fruitFoundAtIndex = i;
                break;
            }
        }
        return fruitFoundAtIndex;
    }

    //delete a given fruit
    private static void deleteFruit(String fruitName) {
        int index = findFruit(fruitName);
        if(index == -1) {
            System.out.println("Fruit not found");
        } else {
            fruits[index] = null;
            System.out.println("Fruit deleted");
        }
    }

    //add a fruit at the first empty spot
    private static void addFruitAtFirst(String fruitName) {
        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i] == null) {
                fruits[i] = fruitName;
                break;
            }
        }
    }

    //add a fruit at last empty spot
    private static void addFruitAtLast(String fruitName) {
        int lastEmptyIndex = -1;
        for(int i = fruits.length - 1; i > -1; i--) {
            if(fruits[i] == null) {
                lastEmptyIndex = i;
                break;
            }
        }

        if(lastEmptyIndex > -1) {
            fruits[lastEmptyIndex] = fruitName;
            System.out.println("Fruit added at index: " + lastEmptyIndex);
        } else {
            System.out.println("Array is full, sorry");
        }
    }
}