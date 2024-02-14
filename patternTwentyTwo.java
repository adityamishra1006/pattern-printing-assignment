import java.util.Scanner;

public class patternTwentyTwo {
    public static void main(String[] args) {
         Scanner sc = new  Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        

        // Upper half of the diamond
        for (int i = 0; i  <  n; i++) {
            // Print left side of the upper half
            for (int j = i; j  <  n; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int k = 0; k  <  2 * i; k++) {
                System.out.print(" ");
            }
            // Print right side of the upper half
            for (int j = i; j  <  n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = 1; i  <  n; i++) {
            // Print left side of the lower half
            for (int j = 0; j  <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int k = 2 * (n - i - 1); k  >  0; k--) {
                System.out.print(" ");
            }
            // Print right side of the lower half
            for (int j = 0; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
