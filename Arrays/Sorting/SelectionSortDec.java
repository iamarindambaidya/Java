public class SelectionSortDec {
    public static void selectionSortDec(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int maxPos = i;
            
            //Checking position of Maximum value
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[maxPos]){
                    maxPos = j;
                }
            }

            //Swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    public static void main(String[] args){
        int array[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSortDec(array);
        printArray(array);
    }
}
