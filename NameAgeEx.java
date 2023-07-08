import java.util.Scanner;

public class NameAgeEx {
    public static void main(String[]args)
    {
        Scanner a =new Scanner(System.in);
        System.out.println("enter your name");
        String name=a.nextLine();
        System.out.println("enter your age");
        int Age=a.nextInt();
        System.out.println("name is :"+name );
        System.out.println("age is :"+Age);
    }
}
