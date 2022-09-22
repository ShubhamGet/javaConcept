import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int a[][] = new int[3][3];
            int i, j;
            System.out.println("Enter element \n");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter element \n");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.println("\t" + a[i][j]);
                }
                System.out.println("\n");
            }
            System.out.println("Diagonal Matrix \n");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (a[i] == a[j]) {
                        System.out.println(+a[j][i]);
                    }
                }
            }
        }
    }
}
