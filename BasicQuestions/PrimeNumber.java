import java.util.Scanner;

public class PrimeNumber {
    public static void main (String args []){
        System.out.print("Enter the Number to check : ");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        if (number == 2){
            System.out.println("Number is Prime");
        } else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(number); i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true){
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is Not-Prime");
            }
        }

        sc.close();
    }
    
}
