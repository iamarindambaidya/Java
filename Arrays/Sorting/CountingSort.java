package Java.Arrays.Sorting;

public class CountingSort{
    public static void countingSort(int arr[]){

        //Finding maximum number
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(arr[i], largest);
        }
        // freequency of the numbers
        int count[] = new int [largest + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        
        //Sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {5,3,4,2,1,4};
        countingSort(array);
        printArray(array);
    }
}