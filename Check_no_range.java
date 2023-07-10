import java.util.Scanner;

public class Check_no_range {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while (n<1||n>10)
        {
            System.out.println("number is not between 1 to 10");
            n=s.nextInt();
        }
        System.out.println("nubmer is between 1 to 10");
    }
}
