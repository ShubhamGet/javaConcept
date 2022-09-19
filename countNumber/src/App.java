import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num, count = 0;
        System.out.println("Enter number to count ");
        num = Sc.nextInt();
        while (num != 0) {
            count = count + 1;
            num = num / 10;
            System.out.println("Total number is " + count);
        }
    }
}
