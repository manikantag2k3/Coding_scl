import java.util.*;
class consonant{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        Stack s=new Stack();
        char temp,temp1;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {
                s.push(a.charAt(i));
            }
            
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {
                System.out.print(s.pop());
            }
            else
            System.out.print(a.charAt(i));
        }
    }
}