/*A string is given. identify the numbers of instances possible for the word "cse"

You can use each character in the string at most once. Return the total number of instances that can be formed.

Explanation1:
input=escsceca
output=2
from the given string, the word "cse" can be formed twice
Explanation2:
input=asceasdf
output=1

Testcases:
case=1
input=escsceca
output=2
*/
import java.util.*;
class test{
    public static boolean verifyAllEqualUsingFrequency(List<Integer> list) {
    return list.isEmpty() || Collections.frequency(list, list.get(0)) == list.size();
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList();
        for(char c:a.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:hm.keySet())
        //  for(int i=0;i<hm.size();i++)
        {
            if('c'==c)
            al.add(hm.get(c));
            if('s'==c)
            al.add(hm.get(c));
            if('e'==c)
            al.add(hm.get(c));
        }
        int min=Collections.min(al);
        
        System.out.println(min);
        
    }
}