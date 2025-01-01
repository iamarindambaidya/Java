package Java.LinearSearch;

public class FindLargest {
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main (String args[]){
        int array[] = {1,2,6,3,5};
        System.out.println("The largest value in the decleared array is : " + largestNum(array));
    }
}
