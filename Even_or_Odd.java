import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[]args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number");
        int no =num.nextInt();
        if(no %2==0)
        {
          System.out.println("even number:"+no);
        }
        if(no %2!=0)
        {
            System.out.println("odd number :"+no);
        }
    }
}
