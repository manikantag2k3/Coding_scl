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
// 
public class midinLL{
    private Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newNode;

        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }
    
}