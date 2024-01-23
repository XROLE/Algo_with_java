package MiddleFunction;
import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] arr = {5,  9};
        System.out.println("I am a chosen one");
        
        System.out.println(Arrays.toString(middle(arr)));
    }

    public static int[] middle(int[] intArray) {
        if(intArray.length < 3){
            return new int[0];
        }

        int[] newArray =  new int[intArray.length - 2];

        for(int i = 1; i < intArray.length - 1; i++){
            newArray[i - 1] = intArray[i];
        }

        return newArray;
    }
}