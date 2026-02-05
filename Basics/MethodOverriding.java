 class A
{
    public int add(int n1, int n2) //original function got overrode
    {                                
                                     
    {                                
                                     
        return n1 +n2;
    }
}
class B extends A
{
    
    public int add(int n1, int n2)  //method overriding
    {  
        return n1 + n2+1;
    }
}

public class methodOverRiding 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        int sum = obj.add(5,6);
        System.out.println(sum);
    }
}
