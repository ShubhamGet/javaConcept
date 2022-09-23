import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int a[][] = new int[3][3];
            int i, j, sum = 0;
            System.out.println("Enter the array element \n");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Entered array element's are \n");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.println(+a[i][j] + "\t");
                }
            }
            System.out.println("Sum of diagonal element from left side second\n");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (a[i] == a[j]) {
                        sum = sum + a[i][j];
                        System.out.println(+sum);
                    }
                }
            }

        }
    }
}
