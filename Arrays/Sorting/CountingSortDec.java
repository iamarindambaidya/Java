public class CountingSortDec {
    public static void countingSortDec(int arr[]){
        
        //Finding Maximum value
        int  maxVal = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxVal = Math.max(arr[i], maxVal);
        }

        //Finding Frequency of number
        int count[] = new int [maxVal+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        
        //Sorting
        int j = 0;
        for(int i=maxVal; i>=0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        int array [] = {3,6,2,1,8,7,4,5,3,1};
        countingSortDec(array);
        printArray(array);
    }
}
