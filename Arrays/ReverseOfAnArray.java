package Java.Arrays;

public class ReverseOfAnArray {
    public static void reverseArray(int arr[]){
        int start = 0, last = arr.length-1;

        while(start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start ++; last--;
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 58, 5};

        reverseArray(array);

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
