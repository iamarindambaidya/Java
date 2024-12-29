package Java.Pattern_II;

public class Butterfly_II {
    public static void main(String[] args) {
        int n = 4;

        // Upper Part
        for(int i=1; i<=n; i++){
            // For Spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            // For Stars
            for(int j=1; j<=2*(n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Part
        for(int i=n; i>=1; i--){
            // For Spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            // For Stars
            for(int j=1; j<=2*(n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
