import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] str= str1.split(" ");
        int len=0;
        for(String x:str){
            len++;
        }
        // System.out.println(str1.length());
        // System.out.println(len);
        int[] arr = new int[len];
        int i=0;
        for(String x : str){
            arr[i]=Integer.parseInt(x);
            i++;
        }
        // for (i=0;i<len;i++)
        // {
        //     System.out.print(arr[i]);
        // }
        Arrays.sort(arr);
        int min=arr[0],max=arr[len-1];
        //System.out.println(min+" "+max);
        if(max%min==0){
            System.out.print(min);
        }
        else{
            for( i=min;i>0;i--){
                if(max%i==0 && min%i==0){
                    System.out.print(i);
                    break;
                }
            }
        }
        
    }
}
// import java.util.*;
// class Test{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         Integer arr[]=new Integer[30];
//         StringTokenizer st=new StringTokenizer(a," ");
//         int n=st.countTokens();
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(st.nextToken());
//         }
//         int min=arr[0],max=arr[0];
//         for(int i=0;i<n;i++)
//         {
            
//             if(arr[i]<min)
//             min=arr[i];
//             if(arr[i]>min)
//             max=arr[i];
//         }
//         int hcf=1;
//         for(int i=1;i<=max;i++)
//         {
//             if(min%i==0&&max%i==0){
//                 hcf=i;
//             }
//         }
//         System.out.println(hcf);
//     }
// }