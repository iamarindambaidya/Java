package Java.Arrays;

public class PairsInArray {
    public static void pairs(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + "),");
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 4, 8, 9, 10, 80};
        pairs(array);
    }
    
}
