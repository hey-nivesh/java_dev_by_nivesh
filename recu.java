// public class recu {
//     public static void main(String[] args) {
//         System.out.println("hello recu");
//     }
// }
// public class recu{                                   // Code for finding factorial of a number 
// static int factorial(int n){
//     // if(n==0 || n==1){
//     //     return 1;
//     // }
//     // else{
//     //     return n*factorial(n-1);
//     // }
//     int pro=1;
//     if (n==0 || n== 1){
//         return 1;
//     }
//     else{
//     for(int i=1; i<=n; i++){
//         pro *= i;
//     }
//     return pro;
//   }
// }
// public static void main(String[] args) {
//     int x = 8;
//     System.out.println(factorial(x));
// }
// }
public class recu{
    static int fibbonaci(int n, int ...arr){
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i<=n; i++){
           arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n = 9;
        int[] arr = new int[n+1];
        System.out.println("the finbbonachi series ka "+n+"th term hai"+fibbonaci(n,arr));
        System.out.println("poori series");
        for(int i=0; i<=n; i++){
           System.out.println(arr[i]+" ");
        }
    }
}