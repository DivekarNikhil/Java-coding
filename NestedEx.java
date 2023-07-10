import java.util.Scanner;

public class NestedEx {
    public static void main(String[]args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        if(n>10)
            System.out.println("number is greater than 10");
        else if(n==10)
            System.out.println("number is equal to 10");
        else
            System.out.println("number is less than 10");
    }
}
