import java.util.Scanner;

public class Do_While_loop
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        do
        {
         System.out.println("enter the number");
         n=s.nextInt();
        }while(n <1 || n>10);

        System.out.println("numberis between 1 to 10");
    }
}
