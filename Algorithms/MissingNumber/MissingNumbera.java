package Algorithms.MissingNumber;
public class MissingNumbera {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};

        System.out.println(findMissingNumberInArray(myArray));
    }

    public static int findMissingNumberInArray(int[] arr){
        int naturalNumber =  arr.length + 1;
        int expectedSum = (naturalNumber * (naturalNumber + 1)) / 2;
        int arrSum = 0;

        for(int i = 0; i < arr.length; i++){
            arrSum += arr[i];
        }

        return expectedSum - arrSum;
    }
}
