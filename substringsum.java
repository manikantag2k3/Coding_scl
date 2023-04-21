import java.util.*;
class substringsum{
public static int sumOddLengthSubarrays(int[] arr) {
    int n = arr.length;
    int result = 0;
    for (int i = 0; i < n; i++) {
        int end = i + 1;
        int start = n - i;
        int total = start * end;
        int odd = total / 2;
        if (total % 2 == 1) {
            odd++;
        }
        result += odd * arr[i];
    }
    return result;
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b[]=a.split(" ");
int[] intArray = new int[b.length];
for (int i = 0; i < b.length; i++) {
    intArray[i] = Integer.parseInt(b[i]);
}     
 
        System.out.println(sumOddLengthSubarrays(intArray));
    }
}
