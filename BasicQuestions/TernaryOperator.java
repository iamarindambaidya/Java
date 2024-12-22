import java.util.Scanner;

public class TernaryOperator {
    // Checking Number is Even or Odd
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String a = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number " + number + " is: " + a);
    }

}
