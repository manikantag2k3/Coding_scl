public import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        LinkedList<Integer> boxes = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int box = scanner.nextInt();
            boxes.add(box);
        }

        Set<Integer> distinctValues = new HashSet<>();

        Iterator<Integer> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            int box = iterator.next();
            if (distinctValues.contains(box)) {
                iterator.remove();
            } else {
                distinctValues.add(box);
            }
        }

        for (int box : boxes) {
            System.out.print(box + " ");
        }
    }
}
 
//   only using linked list
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        LinkedList<Integer> boxes = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int box = scanner.nextInt();
            if(i!=0&&box==boxes.peekLast()){
                continue;
            }
            else
            boxes.add(box);
        }

        
        for (int box : boxes) {
            System.out.print(box + " ");
        }
    }
}
 
   