import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        {
            int num;
            int Fact = 1;
            System.out.println("Enter number ");
            num = sc.nextInt();
            while (num != 0) {
                Fact = Fact * num;
                num = num - 1;

                System.out.println("Factorila of a number is " + Fact);
            }
        }
    }
}
