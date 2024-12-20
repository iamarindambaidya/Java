import java.util.*;

// Area of a Square, By taking input as side
public class areaOfSquare {
    public static void main(String args []){
        System.out.println("Enter side of square value: ");
        Scanner sc = new Scanner (System.in);

        int side = sc.nextInt();

        int area = (side * side);

        System.out.println("Area of the Square is: " + area);
    }
}
