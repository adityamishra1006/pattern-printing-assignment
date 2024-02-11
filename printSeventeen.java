import java.util.Scanner;

public class printSeventeen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (i * 2); j++) {
                System.out.print(" ");
            }

            if (i >= 1) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        System.out.println();
    }
}
