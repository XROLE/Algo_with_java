package Algorithms.DuplicateNumber;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }

    public static int[] removeDuplicates(int[] arr) {
       int[] uniqueArray = new int[arr.length];
       int index = 0;

       for(int i = 0; i < arr.length; i++){
        Boolean isDuplicate = false;

            for(int j = i + 1; j < arr.length; j++ )
            if(arr[i] == arr[j]){
                isDuplicate = true;
                break;
            }

            if(!isDuplicate){
                uniqueArray[index] = arr[i];
                index++;
            }
       }

       return Arrays.copyOf(uniqueArray, index);
    }
}
