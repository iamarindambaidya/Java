package Java.LinearSearch;

public class LinearSearch {

    public static int findKeyIndex(int arr[], int key){
        
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        } return -1;
    }
    
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 5, 10, 14, 15};
        int index = findKeyIndex(array, 5);

        if (index == -1){
            System.out.println(" Number does not exist ..! ");
        } else {
            System.out.println(" Index of the number is : " + index);
        }
    }
}
