package Java.Function_Methods;

public class DecToBinary {
    public static void decToBin(int decNum){
        int myNumber = decNum;
        int pow = 0, bin = 0;

        while (myNumber > 0){
            int lastDigit = myNumber % 2;
            bin += lastDigit * (int)Math.pow(10, pow);
            pow ++;
            myNumber /= 2;
        }
        System.out.println("The Binary of " + myNumber + " is : " + bin);
    }

    public static void main(String[] args) {
        decToBin(10);
    }
}
