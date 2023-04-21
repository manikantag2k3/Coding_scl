public /*Given a string, find size of palindrome with maximum length.

alphabets are case sensitive, for example, "bB" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


testcases:
case=1
input=abccccdd
output=7

*/
import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int sum=0;
        char b[]=a.toCharArray();
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for(char i:b)
        {
            tm.put(i,tm.getOrDefault(i,0)+1);
        }
        for(char i:tm.keySet())
        {
            if(tm.get(i)!=1&&tm.get(i)%2==0)
            {
                sum+=tm.get(i);
            }
        }
        System.out.println(sum+1);
    }
}
 {
    
}
