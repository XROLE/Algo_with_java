public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        int arrSum = sum(myArray2D);

        System.out.println(arrSum);
    }

    public static int sum(int[][] arr){
        int sum  = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }

        return sum;
    }
}
