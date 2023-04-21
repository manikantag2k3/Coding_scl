/*You are given the array of routes, where route[i] = [stateAi, stateBi] means there exists a direct path 
going from stateAi to stateBi. Return the destination state, that is, the state without any route outgoing 
to another state.

It is guaranteed that the graph of routes forms a line without any loop, therefore, 
there will be exactly one destination city.

 

Example 1:

Input: routes = [["telangana","andhrapradesh"],["andhrapradesh","tamilnadu"],["tamilnadu","kerala"]]
Output: "kerala" 
Explanation: Starting at "telangana" state you will reach "kerala" state which is the destination city. 
Your trip consist of: "telangana" -> "andhrapradesh" -> "tamilnadu" -> "kerala".

Example 2:

Input: routes = [["ladakh","jammu"],["punjab","delhi"],["jammu","punjab"]]
Output: "delhi"
Explanation: All possible trips are: 
"ladakh" -> "jammu" -> "punjab" -> "delhi". 
"jammu" -> "punjab" -> "delhi"
"punjab" -> "delhi"
"delhi"
Clearly the destination state is "A".
Example 3:

Input: routes = [["telangana","maharashtra"]]
Output: "maharashtra"

testcases:
case=1
input=telangana,andhrapradesh,andhrapradesh,tamilnadu,tamilnadu,kerala
output=kerala
*/
import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String arr[]=sc.nextLine().split(",");
        Set<String> st=new TreeSet<>();
        for(int i=1;i<arr.length;i++){
            if(st.add(arr[i]));
            else
            st.remove(arr[i]);
        }
       String res=st.toString();
        System.out.println(res.substring(1,res.length()-1));
    }
}