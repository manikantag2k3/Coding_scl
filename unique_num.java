// import java.util.*;
// public class unique_num {
//     public static void main(String args[])
//     {
//          Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[20];
//         int b[]=new int[20];
//         int count=0;
//         for(int i=0;i<size;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++)
//         {
//              for(int j=0;j<size;j++)
//              {
//                 if(arr[i]==arr[j])
//                 {
//                     count++;
//                 }
//              }
//              b[i]=count;
//              count=0;
//         }
//         for(int i=0;i<size;i++)
//         {
//             if(b[i]==1)
//             {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }

// default V getOrDefault(Object key, V defaultValue)
// Parameters: This method accepts two parameters:

// key: which is the key of the element whose value has to be obtained.
// defaultValue: which is the default value that has to be returned, if no value is mapped with the specified key.
// Return Value: This method returns value mapped with the specified key, otherwise default value is returned.
// import java.util.HashMap;

// public class unique_num{
//   public static void main(String[] args) {
//     int[] arr = {1, 2, 3, 2, 4, 3};

//     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//     for (int num : arr) {
//       map.put(num, map.getOrDefault(num, 0) + 1);
//     }
// // print map details
//         System.out.println("HashMap: " + map.toString());
//     for (int num : map.keySet()) {
//       if (map.get(num) == 1) {
//         System.out.println(num);
//       }
//     }
//   }
// }
import java.util.*;
class unique_num{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char i:s.toCharArray())
        {
           hp.put(i,hp.getOrDefault(i,0)+1);
           System.out.println(hp.get(i));
             if(hp.get(i).equals(2)){
             System.out.print(i);
             break;
             }
        }
    }
}