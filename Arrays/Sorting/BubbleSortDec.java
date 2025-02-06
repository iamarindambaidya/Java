public class BubbleSortDec{
    public static void bubbleSortDec(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int i=0; i<arr.length-1-turn; i++){
                if(arr[i] < arr[i+1]){
                    //Swap
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;

                    //Counting Swap
                    swap++;
                }
            }
            if(swap == 0){
            System.out.println("Array is already sorted");
            break;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    public static void main(String[] args){
        int array[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSortDec(array);
        printArray(array);
    }

}