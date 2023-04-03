// import java.util.*;
// class Sum_of_numbers{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[20];
//         for(int i=0;i<size;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("target:");
//         int target=sc.nextInt();
//         for(int i=0;i<size;i++)
//         {
//             for(int j=i+1;j<size;j++)
//             {   
//                 if(i==j)
//                 {
//                     continue;
//                 }
//                 if((arr[i]+arr[j])==target)
//                 {
//                     System.out.println(i+","+j);
//                 }
//             }
//         }
//     }
// }
// other method using hashset
// import java.util.*;
// class Sum_of_numbers{
//     public static void main(String args[])
//     public int[] twoSum(int[] nums, int target) {
//     HashMap<Integer, Integer> map = new HashMap<>();
//     for (int i = 0; i < nums.length; i++) {
//         int complement = target - nums[i];
//         if (map.containsKey(complement)) {
//             return new int[] { map.get(complement), i };
//         }
//         map.put(nums[i], i);
//          Arrays.sort(nums);
//     }
// }}