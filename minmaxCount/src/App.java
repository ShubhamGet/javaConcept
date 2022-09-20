import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int a[] = new int[20];
            int i, n, max, min;
            System.out.println("Enter the lenght \n");
            n = sc.nextInt();
            System.out.println("Enter the element \n");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Array element's \n");
            for (i = 0; i < n; i++) {
                System.out.println(+a[i]);

            }
            max = a[0];
            min = a[0];
            for (i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                } else if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("Max element is " + max);
            System.out.println("Min element is " + min);

        }
    }
}
