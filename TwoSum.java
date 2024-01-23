import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] myArray = {2,7,11,15};

        System.out.println(Arrays.toString(getTwoSum(myArray, 9)));
    }

    public static int[] getTwoSum(int[] arr, int target){
        int[] indices = new int[2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] ==  target){
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }

        return indices;
    }
}
