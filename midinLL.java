import java.util.*;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int data,x;
        LinkedList ll=new LinkedList();
        for(int i=0;i<n;i++)
        {   
            data=sc.nextInt();
            ll.add(data);
        }
        if(n%2==0)
        {
            x=(n+1)/2;
        }
        else
        x=(n)/2;
        System.out.println(ll.get(x));
    }
}