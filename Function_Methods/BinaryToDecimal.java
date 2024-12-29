package Java.Function_Methods;

public class BinaryToDecimal {
    public static void binToDec(int binaryNum){
        int myNumber = binaryNum;
        int pow = 0;
        int dec = 0;

        while (myNumber > 0){
            int lastDigit = myNumber % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow ++;
            myNumber /= 10;
        }
        System.out.println("The Decimal of " + myNumber + " is : " + dec);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
    
}
