import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sum[][] = new int[3][3];
        int i, j;

        System.out.println("Enter 1'st, Element of array ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered 1'st Element of array ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(+a[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("Enter 2'nd Element of array ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered 2'nd Element of array ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(+b[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("Addition of two number ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.println("\t" + sum[i][j]);
            }

        }

    }
}
