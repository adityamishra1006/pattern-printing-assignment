import java.util.Scanner;

public class paternSix {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = n-2; i >= 1; i--){
            for (int j = 0; j <= i; j++){
                 System.out.print("*" + " ");
            }
        System.out.println();
        }
        for (int i = 1; i<= n-2; i++){
            for(int j = 0; j <= i; j++){
                  System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
