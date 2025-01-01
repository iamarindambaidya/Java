package Java.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class BasicInputOutputUpdate {
    public static void main(String[] args) {
        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);
        
        // Taking input for normal variable form
        // int phy;
        // phy = sc.nextInt();

        // Taking Input in an Array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        
        // Outputs of that array
        System.out.println("Phy : " + marks[0]);
        System.err.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        // Update an element
        marks[1] = 85;
        System.out.println("Chem : " + marks[1]);
    }
}
