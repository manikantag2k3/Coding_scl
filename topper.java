import java.util.*;
class topper{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<String> common = new HashSet<>(Arrays.asList(sc.nextLine().split(" ")));
        common.retainAll(Arrays.asList(sc.nextLine().split(" ")));
        common.retainAll(Arrays.asList(sc.nextLine().split(" ")));
        for (String s : common) {
            System.out.print(s + " ");
        }
    }
}