public class star_pattern {
    public static void main(String []args)
    {
        int no=4;
        for(int i=1;i<=no;i++)
        {
            for(int j=1;j<=no;j++) {
                System.out.print("");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
