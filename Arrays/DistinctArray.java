package Java.Arrays;

public class DistinctArray {
    public static boolean sameElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        } return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,69,0,1,5};
        boolean status = sameElement(arr);
        if(status)
        System.out.println("Same element is present");
        else
        System.out.println("Same element is not present");
    }
    
}
