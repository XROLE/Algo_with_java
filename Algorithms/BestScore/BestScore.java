package Algorithms.BestScore;
import java.util.Arrays;

public class BestScore {
   public static void main(String[] args) {
    int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
    System.out.println(Arrays.toString(getBestScore(myArray)));
   } 

   public static int[] getBestScore (int[] intArray){
    if(intArray.length < 3){
        return intArray;
    }

    int firstBestScore = 0;
    int secondBestScore = 0;

    for(int i = 0; i < intArray.length; i++){
        if(intArray[i] > firstBestScore){
            secondBestScore = firstBestScore;
            firstBestScore = intArray[i];
        } else if(intArray[i] > secondBestScore){
            secondBestScore = intArray[i];
        }
    }

    return new int[]{firstBestScore, secondBestScore};
   }
}
