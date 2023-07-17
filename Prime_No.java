import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = s.nextInt();

        for (int i = 2; i <= n / 2; i++) {


            if (n % i == 0) {
                System.out.println("not prime");
                break;
            }


        }
    }
}