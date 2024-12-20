import java.util.*;

public class GroceryBill{
    public static void main (String[] args){
        System.out.println("Enter the Price of Pencil, Pen, and Eresar");
        Scanner sc = new Scanner (System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float ereser = sc.nextFloat();

        System.out.println("Cost of pencil is : " + pencil + " , Cost of Pen is : " + pen +" , and Cost of eraser is : " + ereser);

        float totalPrice = pencil + pen + ereser;

        System.out.println("Total Cost is " + totalPrice);

        sc.close();
    }
}