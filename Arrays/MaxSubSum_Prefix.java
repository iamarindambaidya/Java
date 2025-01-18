package Java.Arrays;

public class MaxSubSum_Prefix {
    public static void MaxSumPrefix(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[arr.length];

        // Calculating Prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Finding Max Sub array Sum
        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;

                // Calculating Current Sum
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println("Current Sum is : " + currentSum);

                // Claculating MaxSum
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        } System.out.println("Maximum Sub Array Sum is : " + maxSum);

    }
    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        MaxSumPrefix(array);
    }
}
