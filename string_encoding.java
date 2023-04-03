import java.util.*;

public class string_encoding {
    public static void main(String args[])
    {
        HashMap hm=new HashMap<Integer,String>();
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int n;
        char []arr=a.toCharArray();
        for(char num:arr)
        {  
            n=sc.nextInt();
           hm.put(n,num);
        }
        for (int i=0;i<a.length();i++)
        {
              System.out.print(hm.get(i));
        }
    }
}
