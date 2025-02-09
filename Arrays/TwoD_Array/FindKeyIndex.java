package Java.Arrays.TwoD_Array;
import java.util.*;

public class FindKeyIndex {
    public static Boolean searchKeyIndx(int arr[][], int key){
    for(int i=0; i<arr.length; i++){
    for(int j=0; j<arr[0].length; j++){
    if(arr[i][j] == key){
    System.out.println("Find index of the element "+key+" at ("+i+" , "+j+")");
    return true;
    }
    }
    }
    System.out.println("We can't find the key");
        return false;
    }

    public static void main(String[] args) {

        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;

        // Taking input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Taking key input
        int key = sc.nextInt();
        searchKeyIndx(arr, key);
    }
}
