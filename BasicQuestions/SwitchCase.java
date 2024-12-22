import java.util.*;

public class SwitchCase{
    public static void main(String args []){
        System.out.println("Input your choice between 1 to 3");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        switch(option){
            case 1: System.out.println("Apple");
            break;
            case 2: System.out.println("Acer");
            break;
            case 3: System.out.println("Asus");
            break;
            default: System.out.println("Enter correct option");
        }
        sc.close();
    }
}