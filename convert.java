import java.util.*;
class convert{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.print("Start= ");
        int start=sc.nextInt();
        int arr[]=new int[20];
String[] inputArray = a.split(" ");
        List<Integer> input = new ArrayList<>();
        for (String element : inputArray) {
            input.add(Integer.parseInt(element));
        }             
                 
List<Integer> result = new ArrayList<>();
        result.add(start);
        for (int i = 0; i < input.size(); i++) {
            int xorValue = result.get(i) ^ input.get(i);
            result.add(xorValue);             
        }         
        Iterator it=result.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}  