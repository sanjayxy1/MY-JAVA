import java.util.Scanner;
public class hello
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        boolean isPalindrome = true;
        
        int reversed= 0;

            for(;num>0;num = num/10)
            {
               int temp = num % 10;
               reversed = reversed * 10 + temp;
            }

            if(original!=reversed)
            {
                isPalindrome = false;
            }

            if(isPalindrome)
            {
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not palindrome");
                }
        
    
    }

}
