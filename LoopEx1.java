import java.util.Scanner;

public class LoopEx1 {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int sum =0 ;
        while(sum <=100)
        {
          System.out.println("Enter the number");
          sum +=s.nextInt();
          if(sum>100)
              break;

        }
        System.out.println("Done all :"+sum);
    }
}
