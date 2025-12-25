import java.util.Scanner;
 class Bank
{
    int balance = 0;
    
    public int deposit(int amount)
    {
        if(amount <= 0) return balance;
        balance+=amount;
        return balance;
    }

    public boolean withdraw(int amount)
    {
        if(amount >=balance) return false;
        if(amount <= 0) return false;
        balance-=amount;
        return true;
    }
    
    public int getbalance()
    {
        return balance;
    }
}
public class atm1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Bank bk = new Bank();
        int CORRECT_PIN = 1407;
        System.out.print("Enter your Pin:");
        int enteredpin = sc.nextInt();
        if(enteredpin != CORRECT_PIN) 
        {
            System.out.println("Wrong Pin!");
            sc.close();
            return;
        }
        
        while(true)
        {
            System.out.println("--------ATM-MENU--------");
            System.out.println("1.Deposit Money");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Choose an option(1-4)");
            
            int choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Amount to Deposit:");
                    int deposit = sc.nextInt();
                    int newBalance = bk.deposit(deposit);
                    System.out.println("Successfully deposited "+ deposit);
                    System.out.println("Your new balance after the deposit: " + newBalance);
                    break;
                
                case 2:
                    System.out.print("Enter the amount you want to withdraw: ");
                    int wd = sc.nextInt();
                    boolean withdraw = bk.withdraw(wd);
                    if(withdraw)
                    {
                        System.out.println("Successfully withdrawn "+ wd);
                        System.out.println("Your new balance after the withdraw: " + bk.getbalance());
                    }
                    else
                    {
                        System.out.println("Invalid amount, Enter a valid amount!");
                    }
                    break;

                case 3:
                    System.out.println("Your Current Balance is: "+ bk.getbalance());
                    break;

                case 4:
                    System.out.println("Thanks, GoodBye!");
                    return;

                default:
                    System.out.println("Invalid choice, Try Again!");
            }   
        }
        
    }
}