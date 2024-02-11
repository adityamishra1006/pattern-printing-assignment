import java.util.Scanner;

public class patternFourteen {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j <= i) {
                    System.out.print((char)(j+64));
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 2; k <= i; k++) {
                System.out.print((char)(k+64));
            }
            System.out.println();
        }
    }
}
