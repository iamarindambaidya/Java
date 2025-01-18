package Java.Arrays;

public class MaxSubSum_Kadane {
    public static void maxSumKadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        //Calculating Kadane's array
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];

            if(currentSum < 0){
                currentSum = 0;
            }
            System.out.println("Current Sum is : " + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        } System.out.println("Maximum Sum is : " + maxSum);
    }
    public static void main(String[] args) {
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {1, -2, 6, -1, 3};
        maxSumKadane(arr);
    }
}
