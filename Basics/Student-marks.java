import java.util.Scanner;
public class marks 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        String subjects[] = {"Art" , "English" ,"Maths" , "Science" , "Java"};
        int total=0;

        int mark[] = new int[subjects.length];

        for(int i = 0; i <subjects.length;i++)
        {
            System.out.print("Enter the mark of subject "+ subjects[i] + ": ");
            mark[i] = sc.nextInt();
            
             total += mark[i];
        }
        System.out.println("Total: " + total);
        double avg = total / 5.0;
        System.out.println(avg);
        char Grade = ' ';
        if(avg >=90.0 && avg <= 100.0)
        {
            Grade = 'A';
            System.out.println("Grade: " + Grade);
        }
        else if(avg >= 80.0 && avg <= 89.0)
        {
            Grade = 'B';
            System.out.println("Grade: " + Grade);
        }
        else if(avg >= 60.0 && avg <= 79.0)
        {
            Grade = 'C';
            System.out.println("Grade: "+ Grade);
        }
        else if(avg >= 40.0 && avg <= 59.0)
        {
            Grade ='D';
            System.out.println("Grade: "+ Grade);
        }
        else
        {
            System.out.println("Fail!");
        }
        sc.close();
         
    }
}
