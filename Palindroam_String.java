public class Palindroam_String {
    public static void main(String[]args)
    {
        String str="ssa";
        boolean isPalindrome=true;
//   int j;
        for(int i=0, j=str.length()-1;i<j; i++,j--)
        {
           if

                (str.charAt(i) ==str.charAt(j))
                  continue;

           isPalindrome=false;
           break;
        }
        System.out.println(isPalindrome ?"palindrome":"not palindrome");
    }
}
