package Java.Arrays.Sorting;

public class InsertionSortDec {
    public static void insertionSortDec(int arr[]){
        for(int i=1; i<arr.length; i++){
            int currVal = arr[i];
            int prevIndx = i-1;

            //finding right position
            while(prevIndx >= 0 && arr[prevIndx] < currVal){
                arr[prevIndx+1] = arr[prevIndx];
                prevIndx--;
            }

            //Inserting currect value
            arr[prevIndx+1] = currVal;
        }
    }

    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } System.out.println();
    }
    public static void main(String[] args) {
        int array [] = {3,6,2,1,8,7,4,5,3,1};
        insertionSortDec(array);
        printArray(array);
    }
}
