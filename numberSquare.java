import java.util.Scanner;

public class numberSquare{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        System.out.print("Enter the number of coulmns : ");
        int n = sc.nextInt();

        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}