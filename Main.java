// public class Main { 
//     public static void main(String[] args) {
//         int hro = 88;
//         System.out.println("mera naam hai "+  hro);
//     }
    
// }
// public class Main{
//     public static void main(String[] args) {
//         byte Mynum = -111;
//         System.out.println(Mynum);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         float c_one = 66e9f;
//         System.out.println(c_one);

//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         double hum = 76E6d;
//         System.out.println(hum);
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         double myDouble = 999d;
//         int mynewint = (int) myDouble;
//         System.out.println(mynewint);
//     }
// }
// public class Main {
//     public static void main(String[] args){
//         int x = 90;
//         int y = 87;
//         System.out.println(x>=y);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         int x = 88;
//         x>>=3;
//         System.out.println(x);

//     }
// }
// public class Main {
//     public static void main(String[] args){
//         String fname = "Nivesh ", lname = "Jain";
//         System.out.println(fname.concat(lname));
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//        int fib = 10, i = 1;
//        while (i>0){
//         ++fib;
//         fib += fib;
//         System.out.println(fib);
//        }
       
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         System.out.println(Math.random());
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         int x = 89;
//         int y = 90;
//         if (x>=y){
//             System.out.println("Tu chutiya hai");
//         }
//         else if (x<=y){
//             System.out.println("Manvali baat mil gyi tssli");
//         }
//         else{
//             System.out.println("Tu ganja km piya kr");
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         int time = 24;
//         String ans  = (time<18) ? "acha vkt aagya" : "bs itna hi hota hai";
//         System.out.println(ans);
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         while (scanner.hasNextLine()) {
//             String line = scanner.nextLine();
//             System.out.println(line); // Write the line to standard output
//         }

//         scanner.close();
//     }
// }
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner cc = new Scanner(System.in);
//         int day = cc.nextInt();
//         switch (day){
//             case 1:
//             System.out.println("Monday");
//             break;
//             case 2:
//             System.out.println("Tuesday");
//             break;
//             case 3:
//             System.out.println("Wednusday");
//             break;
//             case 4:
//             System.out.println("Thursday");
//             break;
//             case 5:
//             System.out.println("Friday");
//             break;
//             case 6:
//             System.out.println("Saturday");
//             break;
//             case 7:
//             System.out.println("Sunday");
//             break;
//             default:System.out.println("Sahi no. enter kr bhdve");
//             cc.close();
//         }
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner cc = new Scanner(System.in);
//         int chlana = cc.nextInt();
//         int i = cc.nextInt();
//         while (i<chlana){
//             System.out.println(i+"\n");
//             ++i;
//         } 
//         cc.close();
//     } 
    
// }
// import java.util.Scanner;
// public class Main {

//     public static void main(String[] args) {
//         Scanner cc = new Scanner(System.in);
//         int i = cc.nextInt();
//         do{
//             System.out.println(i);
//             ++i;
//         }while(i<9);
//         cc.close();
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner cc = new Scanner(System.in);
//         int dice = cc.nextInt();
//         int i = 1;
//         while (dice<=6 && i<=6){
//             if(dice<6){
//                System.out.println(i+"."+"NoYatzy");
//             }
//             else{
//                 System.out.println(i+"."+"Yatzy");
//             }
//             dice+=1;
//             i+=1;
//         }
//         cc.close();
//     }
// }
// public class Main {
//     public static void main(String[] args){
//        for(int i = 0;i<=10;++i){
//         System.out.println(i);
//        }
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner cc = new Scanner(System.in);
//         int n = cc.nextInt();
//         for (int i = 0; i<100; i++){
//             System.out.println(n);
//         }
//         cc.close();
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         for (int i = 1; i<101; i++){
//             System.out.println(i);
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int i,j; 
//         for (i=1; i<=5 ; i++){
//             for (j=1; j<=5; j++){
//                 System.out.println("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int i,j,n;
//         n = 7;
//         for (i=1;i<=n-1;i++){
//             for (j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(j=1; j<=(n-i);j++){
//                 System.out.print(j);
//             }
//             for(j=1; j<=n-1-i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         for (int i=0; i<=100; i+=10){
//             if(i==50){
//                 continue;
//             }
//             System.out.print(i+" ");
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int[] cars = {1,2,4,5,6,7,3,2};
//         for (int i :cars){
//             System.out.print(i*(cars[3])+" ");
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         String[] cars = {"ii","yguy","uvu","yuyvuj","gyvvb"};
//         for (int i = 0; i<cars.length;i++){
//             System.out.println(cars[i]);
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         int[] ages = {1, 2, 3, 4, 5, 6, 7, 4};
//         int len = ages.length;
//         float sum = 0;
//         int lowestAge = ages[0];
//         for (int age : ages) {
//             sum += age;
//             if (lowestAge > age) {
//                 lowestAge = age;
//             }
//         }
//         float avg = sum / len;
//         System.out.println("Lowest age: " + lowestAge);
//         System.out.println("Average age: " + avg);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//       // An array storing different ages
//       int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
      
//       // Create a 'lowest age' variable and assign the first array element of ages to it
//       int lowestAge = ages[0];
  
//       // Loop through the elements of the ages array to find the lowest age
//       for (int age : ages) {
//         // Check if the current age is smaller than the current 'lowest age'
//         if (lowestAge > age) {
//           // If the smaller age is found, update 'lowest age' with that element
//           lowestAge = age;
//         }
//       }
  
//       // Output the value of the lowest age
//       System.out.println("The lowest age in the array is: " + lowestAge);
//     }
//   }
// public class Main {

//     public static void main(String[] args) {
//         int[][] indo = {{8,7,6},{6,6,9,7},{6,6,9,6}};
//         System.out.println(indo[1][2]);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         int[][] lst = {{7,8,5,6},{5,3,5,8},{7,4,2,5},{2,5,1,5}};
//         lst[2][2] = 6;
//         for (int i=0; i<lst.length; i++){
//             for (int j=0; j<lst[i].length; j++){
//                 System.out.print(lst[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//        Scanner cc = new Scanner(System.in);
//        double num = cc.nextDouble();
//        System.out.println(num);
//        cc.close();
//     }
// }
// public class Main{
//     static void newMethod() {
//         System.out.println("aaj khelenge mathod mathod");
//     }
//     public static void main(String[] args){
//         newMethod();
//         newMethod();
//         newMethod();
//         newMethod();
//         newMethod();
//     }
// }
// public class Main {

//     static void matrixhula(){
//         int[][] lst = {{7,8,5,6},{5,3,5,8},{7,4,2,5},{2,5,1,5}};
//         lst[2][2] = 6;
//         for (int i=0; i<lst.length; i++){
//             for (int j=0; j<lst[i].length; j++){
//                 System.out.print(lst[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         matrixhula();
//     }
// }
// public class Main{
//     static void hola(String name, int num){
//         System.out.println(name+" hai "+num);
//     }
//     public static void main(String[] args) {
//         hola("Billa", 420);
//     }
// }
// public class Main{
//     static void abhibtatathu(int age){
//         if (age>=18){
//             System.out.println("Krle mje :)");
//         }
//         else{
//             System.out.println("chup chap pdhayi kr");
//         }
//     }
//     public static void main(String[] args) {
//         abhibtatathu(12);
//     }
// }
// public class Main{
//     static String nyachutiyapa(String x){
//         return x + " Jain";
//     }
//     public static void main(String[] args) {
//         System.out.println(nyachutiyapa("Nivesh"));
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         int k = sum(10);
//         System.out.println(k);
//     }
//     public static int sum(int n){
//         if (n>0){
//            return n+sum(n-1);
//         }
//         else{
//             return 0;
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int result = sum(5,10);
//         System.out.println(result);
//     }
//     public static int sum(int start, int end){
//         if (end>start){
//             return end+sum(start, end-1);
//         }
//         else{
//             return end;
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int result = max(8,9,6);
//         System.out.println(result);
//     }
//     public static int max(int a, int b, int c){
//         if (a>b){
//             if (a>c){
//                 return a;
//             }
//             else{
//                 return c;
//             }
//         }
//         else{
//             if (b>c){
//                 return b;
//             }
//             else{
//                 return c;
//             }
//         }
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner cc = new Scanner(System.in);
//         int a, b, c;
//         a = cc.nextInt();
//         b = cc.nextInt();
//         c = cc.nextInt();
//         int result =  min(a, b, c);
//         System.out.println(result);
//         cc.close();
//     }
//     public static int min(int a, int b, int c){
//         if (a<b){
//             if (a<c){
//                 return a;
//             }
//             else{
//                 return c;
//             }
//         }
//         else{
//             if (b<c){
//                 return b;
//             }
//             else{
//                 return c;
//             }
//         }
//     }
// }
// public class Main{
//     int x = 900;
//     public static void main(String[] args) {
//         Main nyaobj = new Main();
//         System.out.println(nyaobj.x);
//     }
// }
// public class Main {
//     int x = 5;
    
//     public static void main(String[] args) {
//         Main myObj = new Main();
//         System.out.println(myObj.x);
//     }
// }

// class Second {
//     void someMethod() {
//         System.out.println("me hu sec class");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         System.out.println(Second());
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         // String hui = "Nivesh Jain";
//         // System.out.println(hui.toUpperCase());
//         // System.out.println(hui);
//         // String nontri = "   Nivesh   ";
//         // System.out.println(nontri.trim());
//         // System.out.println(hui.replace('N','G'));
//         // System.out.println(hui.replace("ves","arv"));
//     String Name = "BharryBharry";
//     System.out.println(Name.charAt(4));
//     System.out.println(Name.lastIndexOf("y"));
//     System.out.println(Name.equals("BharryBharry"));
//     System.out.println(Name.indexOf("a"));
//     System.out.println(Name.equalsIgnoreCase("BharryBharry"));
//     }

// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String Day = sc.nextLine();
//         switch(Day){
//             case "mon" -> System.out.println("aaj toh monday hai");
//             case "tue" -> System.out.println("aaj toh tuesday hai");
//             case "wed" -> System.out.println("aaj toh wednusday hai");
//             case "thu" -> System.out.println("aaj toh thusday hai");
//             case "fri" -> System.out.println("aaj toh friday hai");
//             case "sat" -> System.out.println("aaj toh sat hai");
//             case "sun" -> System.out.println("aaj toh sunday hai");
//             default -> System.out.println("day bhi ni dale ja rhe tere se");
//         }
//         sc.close();
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String Day = sc.nextLine();
//         switch(Day){
//             case "mon" -> System.out.println("aaj toh monday hai");
//             case "tue" -> System.out.println("aaj toh tuesday hai");
//             case "wed" -> System.out.println("aaj toh wednusday hai");
//             case "thu" -> System.out.println("aaj toh thusday hai");
//             case "fri" -> System.out.println("aaj toh friday hai");
//             case "sat" -> System.out.println("aaj toh sat hai");
//             case "sun" -> System.out.println("aaj toh sunday hai");
//             default -> System.out.println("day bhi ni dale ja rhe tere se");
//         }
//         sc.close();
//     }
// }
// public class Main{
//     public static void main(String[] args){
//        float[] jindgi = {67.87f, 54.56f, 87.34f, 23.43f};
//        float sum = 0;
//        for(float jindgi_k_tatv : jindgi){
//         sum = sum + jindgi_k_tatv;
//        }
//        System.out.println("Jinggi k tatav is eqauls to : "+sum);
//     } 
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         int[] ch_num = {67,34,2,43,453,654,34};
//         Scanner cc = new Scanner(System.in);
//         int abla = cc.nextInt();
//         boolean inArray = false; 
//         for(int ele:ch_num){
//             if (abla==ele) {
//                 inArray = true;
//                 break;
//             }
//         }
//         if(inArray){
//             System.out.println("the val is in array");
//         }
//         else{
//             System.out.println("The val is not in array");
//         }
//         cc.close();
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         int[][] mat1 = {{2, 3, 4}, {5, 6, 4}, {9, 7, 4}};
//         int[][] mat2 = {{9, 7, 8}, {6, 4, 3}, {4, 5, 3}};
//         int[][] result = new int[3][3];

//         for (int i = 0; i < mat1.length; i++) {
//             for (int j = 0; j < mat1[i].length; j++) {
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//                 System.out.format("Setting the value of i=%d and j=%d \n", i, j);
//             }
//         }

//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[i].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     static int mera_func(int x, int y){
//         int z;
//         if(x>y){
//             z = x+y;
//         }
//         else{
//            z = x-y;
//         }
//       return z;
//     }   

//     public static void main(String[] args) {
//         int c = mera_func(2000, 4000);
//         System.out.println(c);
//     }
// }
// public class Main{
//     static void me_nhi_krunga_return(){
//         System.out.println("Nhi krta me return kuch isiliye \n mere andr void use kiya gya hai! ");
//     }
//     public static void main(String[] args) {
//         me_nhi_krunga_return();
//     }
// }
// public class Main{
//     // static void change1(int a){
//     //     a = 67;
//     // }
//     static void change2(int[] gma){
//         gma[0] = 90;
//     }
//     // public static void main(String[] args) {
//     //     int x = 78;
//     //     change1(x);
//     //     System.out.println("dekhte hai output kya ayega :"+x);
//     // }
//     public static void main(String[] args) {
//         int[] b = {78,24,64,24,13,56,75,75,4,57,4,64};
//         change2(b);
//         System.out.println("dekhte hai kya change rhega: "+b[0]);
//     }
// }
// public class Main{
//     static int new_func(int ...ary){
//         int result=0;
//         for(int a : ary){
//             result += a;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println("solving variable agrumnets problem the output is:"+ new_func(2,3,4,5,6,3));
//     }
// }