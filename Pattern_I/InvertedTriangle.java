package Java.Pattern_I;
import java.util.*;

public class InvertedTriangle {
    public static void main(String args []){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
