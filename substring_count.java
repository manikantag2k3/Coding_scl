 import java.util.*;
class substring_count{
public static int countSubstrings(String s) {
    int count = 0;
    for (int i = 0; i < s.length() - 3; i++) {
        String substring = s.substring(i, i + 4);
        Set<Character> chars = new HashSet<>();
        for (char c : substring.toCharArray()) {
            chars.add(c);
        }
        if (chars.size() == 4) {
            count++;
        }
    }
    return count;
    
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    System.out.println(countSubstrings(a));
}
}