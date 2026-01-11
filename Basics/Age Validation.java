import java.util.Scanner;
class Human
{
    private int age;
    private String name;
    public Human()
   

    public boolean setAge(int age)
    {
        if(age>=12)
        {
        this.age = age;
        return true;
    }
    else
        {
        return false;
        }
}
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class GetSet
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Human h = new Human();
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        if(!h.setAge(Age))
        {
            System.out.println("Sorry this is only for 12 and above");
            sc.close();
            return;
        }
        else
        {

        h.setAge(Age);
        h.setName(Name);
        
        System.out.println("Name: " + h.getName());
        System.out.println("Age: " + h.getAge());
        }
        sc.close();
    }
}
