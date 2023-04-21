/*Bob given two strings to jack, asking jack to comapre s1 and s2 to find are they 
follwing same sequence of pattern or not. if they are following print true otherwise false.

Sample Data1:
Input: 
baab
rat mat mat rat
Output: true

Sample Data2:

Input: 
abba 
mat rat rat sat
Output: false
*/
import java.util.*;
 class Test{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         boolean flag=true;
         String a=sc.nextLine();
         String b=sc.nextLine();
         String c[]=b.split(" ");
         HashMap<Character,String> hp=new HashMap<Character,String>();
         for(int i=0;i<a.length();i++)
         {
            //  hp.put(a.charAt(i),c[i]);
             String prev=hp.put(a.charAt(i),c[i]);
             if(prev==null||hp.get(a.charAt(i)).equals(prev))
             {
                 continue;
             }
             else
             {
                 flag=false;
                 break;
             }
         }
         System.out.println(flag);
     }
 }