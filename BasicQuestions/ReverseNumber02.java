import java.util.Scanner;

public class ReverseNumber02 {
    public static void main(String args []){
        System.out.print("Enter Input : ");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int rev = 0;
        while(number > 0){
            int rem = number % 10;
            rev = (rev * 10) + rem;
            number /= 10;
        }
        System.out.println("Reverse of the Input number is : " + rev);
    }
}
