
public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] myArray =  {7, 1, 5, 3, 6, 4};

        System.out.println(getBestTime(myArray));
    }

    public static int getBestTime(int[] arr){
        int maximumProfit = 0;

        if(arr.length < 2){
            return 0;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] - arr[i] > maximumProfit){
                    // System.out.println(arr[j]);
                    // System.out.println(arr[i]);
                    maximumProfit = arr[j] - arr[i];
                    
                }
            }
        }

        return maximumProfit;
    }
}