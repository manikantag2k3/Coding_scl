/*You are given list of numbers. find the sum of numbers that appear exactly once in the list.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The non repeating numbers are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no non-repeating numbers, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The non repeating numbers are [1,2,3,4,5], and the sum is 15.

Testcases:
case=1
input=1 2 3 2
output=4
*/
import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String arr[]=sc.nextLine().split(" ");
        Set<String> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(st.add(arr[i]))
            ;
            else
            st.remove(arr[i]);
        }
        for(String s:st){
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}