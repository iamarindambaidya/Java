package Java.Arrays;

public class MaxSubarraySum_I {
    public static void maxSubarraySum(int array[]){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int count = 0;
                for(int k=i; k<=j; k++){
                    count += array[k];
                } System.out.println("Current Sub-Array Sum is : " + count); 
                if(count > maxsum){
                    maxsum = count;
                }
            }
        } System.out.println("Maximum Sum of the Subarray is: " + maxsum);
    }

    public static void main(String[] args) {
        int array[] = {2,4,5,8,6,3};
        maxSubarraySum(array);
    }
}
