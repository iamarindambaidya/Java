package Java.Arrays.Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j])
                minPos = j;
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        int array [] = {5,7,8,4,6,2,1};
        selectionSort(array);
        printArray(array);
    }
    
}
