import java.util.Scanner;

public class ReverseNumber01 {
    public static void main (String args []){
        System.out.println("Enter Input : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        

        while(number > 0){
            int rem = number % 10;
            System.out.print(rem);
            number = number / 10;
        }
        sc.close();

    }
    
}
