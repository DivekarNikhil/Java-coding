import java.util.Scanner;

public class ifstatement {
    public static void main(String[]args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the value ");
        int a=s.nextInt();
        int b=s.nextInt();
//        int x = 6;
//        int y = 7;
        if (a > b) {
            System.out.println("x is greater");
        }
        else
        System.out.println("y is greater");
    }
}
