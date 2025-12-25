public class ATM
{
    public static void main(String[] args)
    {
        char s ='*';
        for(int i=1;i<=5;i++)
            {
            
            for(int j = i;j<5;j++)
            {   
                System.out.print(s);
                
            }
            for(int k = 1;k<=i;k++)
            {
                System.out.print(k+"");
            }
            System.out.println();
            
        }

    }
}