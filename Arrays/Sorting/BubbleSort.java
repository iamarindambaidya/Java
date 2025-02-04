package Java.Arrays.Sorting;

public class BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn ++){
            int swap = 0;
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    //counting swap
                    swap ++;
                }
            }
            if (swap == 0){
                System.out.println("Array has been sorted/ already sorted");
                break;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        int array [] = {5,7,8,4,6,2,1};
        bubbleSort(array);
        printArray(array);
    }
}