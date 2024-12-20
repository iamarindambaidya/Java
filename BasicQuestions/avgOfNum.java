import java.util.*;


// Average of Three Numbers
public class avgOfNum {
    public static void main(String args []){
        System.out.println("Input Three Numbers : ");
        Scanner sc = new Scanner(System.in);
        
        int FirstNum = sc.nextInt();
        int SecondNum = sc.nextInt();
        int ThirdNum = sc.nextInt();

        int sum = (FirstNum + SecondNum + ThirdNum);      
        double avg = (sum / 3.0);

        System.out.println("Sum of Three Numbers are: " + sum);
        System.out.println("Average is " + avg);
    }
}