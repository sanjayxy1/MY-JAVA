import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
            Map<String,Integer > Contacts = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            Contacts.put(name, phone);
            
        }
        /*hasNext is used when:You don’t know how many inputs will come
        Purpose of this while loop:
        Run this loop as the as the inputs exists */
        while(in.hasNext()){
            //Getting input To look for the name in Contacts
            String s = in.next();
            if(!Contacts.containsKey(s))
            {
                System.out.println("Not found");
            }
            else{
            
             System.out.println(s + "="+Contacts.get(s));
            }
            
        }
        
        
        in.close();
    }
}
