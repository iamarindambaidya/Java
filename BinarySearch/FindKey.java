package Java.BinarySearch;

public class FindKey{
    public static int keyIndex(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
    
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == key){
                return mid;
            }

            if (key > arr[mid]){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        } 
        return -1;
    }

    public static void main (String args []){
        int array[] = {2, 4, 6, 8, 15, 35, 46};

        int index = keyIndex(array, 15);
        if (index == -1){
            System.out.println("Target does not exist in the array");
        } else {
            System.out.println("Index Of the Target present at : " + index);
        }
    }
}