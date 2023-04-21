/*Given a word consisting of lowercase characters from a to z, 
your task is to print the first character to emerge twice.

Note:

A character a appears twice before another character b if the second occurrence
of a is before the second occurrence of b.
w will contain at least one character that emerge twice.
 

sample1:

Input: s = "baccadbbcz"
Output: "c"
Explanation:
The character 'b' appears on the indexes 0, 6 and 7.
The character 'a' appears on the indexes 1 and 4.
The character 'c' appears on the indexes 2, 3 and 8.
The character 'z' appears on the index 9.
The character 'c' is the first character to emerge twice,
because out of all the characters the index of its second occurrence is the smallest.

sample 2:
Input: s = "cbaee"
Output: "e"
Explanation:
The only character that emerged twice is 'e' so we print 'e'.
 
w consists of lowercase characters.
w has at least one repeated character.
*/
import java.util.*;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char i:s.toCharArray())
        {
           hp.put(i,hp.getOrDefault(i,0)+1);
           
             if(hp.get(i).equals(2)){
             System.out.print(i);
             break;
             }
        }
    }
}
