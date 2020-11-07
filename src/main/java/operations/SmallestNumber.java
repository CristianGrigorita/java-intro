package operations;

import java.util.Arrays;

/**
 * 2. Display the smallest number from an array of number
 */
public class SmallestNumber {
    public int smallestInArray(String array){
        int[] intArr = getArray(array);
        // assigning first number in array to smallest.
        // to be able to use smallest for comparison in if.
        int smallest = intArr[0];
        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] < smallest) {
                smallest = intArr[i];
            }
        }
        return smallest;
    };

    public int sortArray(String array){
        int[] intArr = getArray(array);
        Arrays.sort(intArr);
        return intArr[0];
    }

    public static int[] getArray(String string) {
        String[] stringsArray = string.trim().split("\\s+");
        int[] intArray = new int[stringsArray.length];
        for(int i=0; i < stringsArray.length; i++){
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }

        return intArray;
    };
}
