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
// public class Main{
//     static double meramethod(int a, double y){
//         double z = a+y;
//         return z;
//     }
//     public static void main(String[] args) {
//         double z = meramethod(23, 89.87);
//         System.out.println(z);
//     }
// }

// public class Main{
//     class kdmdi{
//         int rollno;
//         String name;
//         float sal;
//         kdmdi(){
//             this.rollno = 89;
//             this.name = "Nivesh Jain";
//             this.sal = 89.987f;
//     }

//     }
//     public static void main(String[] args) {
//         System.out.println("roll no  " + rollno + "Name" + name + "salary" + sal);
//     }
// }
// printing by for loop 
// public class Main{
//     public static void main(String[] args) {
//         int[] marks = {100,77,22,33,11};
//         for(int i = 0; i<marks.length; i++){
//             System.out.println(marks[i]);
//         }
//         for(int i = marks.length-1; i>=0; i--){
//             System.out.println(marks[i]);
//         }
//     }
// }
// For Each loop 
// public class Main{
//     public static void main(String[] args) {
//         int[] marks = {111, 333, 333, 777, 888, 999};
//         for(int element: marks){
//             System.out.println(element);
//         }
//     }
// }
// printing patterns
// public class Main{
//     public static void main(String[] args){
//         for(int i = 0; i<=5; i++){
//             for(int j = 0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// printing 2D array
// public class Main{
//     public static void main(String[] args) {
//         int[][] marks = new int[2][2];
//         marks[0][0] = 12;
//         marks[0][1] = 11;
//         marks[1][0] = 13;
//         marks[1][1] = 17;
//         for(int i = 0; i<2; i++){
//             for(int j = 0; j<2; j++){
//                 System.out.print(marks[i][j]+" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }
// Method Understanding
// public class Main {
//    static int meramethod(int a, int b){
//       int c;
//       if(a>b){
//          c = a+b;
//       }
//       else{
//          c = a-b;
//       }
//       return c;
//    }
//    public static void main(String[] args) {
//       int x = 12;
//       int y = 7;
//       int z = meramethod(x, y);
//       System.out.println(z);
//    }

// }
// public class Main {
//    static void telljokes() {
//       System.out.println(
//             "Mera naam hai iggu \n httela maa meri shetan ki beti \n baap mera shetan ka chela \n khayega kela!");
//    }

//    public static void main(String[] args) {
//       telljokes();
//    }
// }
// public class Main {
//    static void change(int [] arr){
//       arr[0]=89;
//    }
//    public static void main(String[] args) {
//       int [] arr1 = {76,44,33,53,24,13,53};
//       change(arr1);
//       System.out.println("change in the array occur ?? lets see: " + arr1[0]);
//    }

// }
// Method Overloading
// public class Main {
//    static void foo() {
//       System.out.println("hello chaman");
//    }

//    static void foo(int a) {
//       System.out.println("hello " + a + " number k chaman");
//    }

//    static void foo(int a, int b) {
//       System.out.println("hello " + a + " number k chaman");
//       System.out.println("hello " + b + " number k chaman");
//    }

//    // static int foo(int a) {
//    //    System.out.println("hello chaman");      //it will produce error cuz 
//    // }                                          //we can't change return type in methode overloading

//    public static void main(String[] args) {
//       foo();
//       foo(69);
//       foo(89, 90);
//    }
// }
// Understanding Varuable agrumnets
// public class Main {
//  static int sum(int ...arr){
//    int result = 0;
//    for(int a:arr){
//       result+=a;
//    }
//    return result;
//  }
//    public static void main(String[] args) {
//       System.out.println(sum());
//    }
// }
// Understanding Recursion
// public class Main {
//   static int facto(int a){
//    if(a==0||a==1){
//       return 1;
//    }
//    else{
//       return a*facto(a-1);
//    }
//   }
//   static int fibo(int a){
//    if(a<0){
//       return 0;
//    }
//    else if(a<=1){
//       return 1;
//    }
//    else{
//       return fibo(a-1)+fibo(a-2);
//    }
//   }
//   public static void main(String[] args) {
//    System.out.println(facto(5));
//    System.out.println(fibo(8));
//   }
// }
// Fuction and recursion parctice questions 
// public class Main {
//    static void mul_table(int n) {
//       for (int i = 0; i <= 10; i++) {
//          System.out.format("%d x %d = %d \n ", n, i, n * i);
//       }
//    }
//    static void pattern1(int a){
//       for(int i = 0; i<a; i++){
//          for(int j = 0 ; j<=i; j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//    }
//    static int sum_rec(int a){
//       if(a>0){
//          return a+sum_rec(a-1);
//       }
//       else{
//          return 0;
//       }
//    }
//    static int fibo(int a){
//       if(a==1||a==2){
//          return a-1;
//       }
//       else{
//          return fibo(a-1)+fibo(a-2);
//       }
//    }
//    static void pattern2(int a){
//       for(int i = 0; i<a; i++){
//          for(int j = a; j>i; j--){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//    }
//    static int avg(int ...arr){
//       int sum = 0;
//       for(int i:arr){
//          sum+=i;
//       }
//       return sum/arr.length;
//    }
//    static void pattern1_rec(int a){
//       if(a>0){
//          pattern1_rec(a-1);
//          for(int i = 0; i<a; i++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//    }
//    static float convetctof(float c){
//       float f = c*1.8f+32;
//       return f;
//    }
//    public static void main(String[] args) {
//       problem1
//       mul_table(9);
//       // problem2
//       pattern1(9);
//       // problem3
//       System.out.println(sum_rec(5));
//       problem4
//       System.out.println(fibo(8));
//       problem5
//       pattern2(5);
//       problem6
//       System.out.println(avg(2,3,4,5,6,7,8,9,10));
//       problem7
//       pattern1_rec(9);
//       problem8
//       System.out.println(convetctof(8));
//    }
// }
// Understanding class in OOP
// class emp{
//    int id;
//    String name;
//    int salary;
//    public void printdetails(){
//       System.out.println("My Id is: "+id);
//       System.out.println("My name is: "+name);
//    }
//    public int getId(){
//       return id;
//    }
//    public int getSalary(){
//       return salary;
//    }
// }
// public class Main {
//    public static void main(String[] args) {
//       emp nivesh = new emp();
//       nivesh.id = 69;
//       nivesh.name = "Nivesh Jain";
//       nivesh.salary = 1000000;
//       // System.out.println(nivesh.name);
//       // System.out.println(nivesh.id);
//       nivesh.printdetails();
//       emp pushparaj = new emp();
//       pushparaj.id = 76;
//       pushparaj.name = "Pushparaj Tiwari";
//       pushparaj.salary = 200;
//       pushparaj.printdetails();
//       int id1 = nivesh.getId();
//       System.out.println(id1);
//       int salary1 = nivesh.getSalary();
//       System.out.println("Nivesh ki salary "+salary1);
//       int id2 = pushparaj.getId();
//       System.out.println(id2);
//       int salary2 = pushparaj.getSalary();
//       System.out.println("Pushparaj ki salary "+salary2);
//    }

// }
// Understanding access modifiers and constructors
// class myemp{
//    private int id;
//    private String name;
//    // public myemp(){
//    //    id = 00;
//    //    name = "Your name here";
//    // }
//    public myemp(int myid, String myname){
//       this.name = myname;
//       this.id = myid;
//    }
//    public void setid(int id){
//       this.id = id;
//    }
//    public int getid(){
//       return id;
//    }
//    public void setname(String name){
//       this.name = name;
//    }
//    public String getname(){
//       return name;
//    }
// }
// public class Main{
//    public static void main(String[] args) {
//       myemp nivesh = new myemp(69, "Nivesh Jain");
//       // nivesh.setid(69);
//       // nivesh.setname("Nivesh Jain");
//       System.out.println(nivesh.getid());
//       System.out.println(nivesh.getname());
//    }
// }
// Need to fix it 
// import java.util.Random;
// import java.util.Scanner;

// class RandomNumberGame {
//    static int randomnogenerator(int max, int min) {
//       Random random = new Random();
//       return random.nextInt(max - min + 1) + min;
//    }

//    public RandomNumberGame() {
//       int attempts = 0, guess = 0;
//       int RandomNumber = randomnogenerator(100, 1);
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("The game is from 1-100 you have to guess the number");
//       while (guess != RandomNumber) {
//          System.out.print("Enter your guess: ");
//          guess = scanner.nextInt();
//          attempts++;
//          if (guess == RandomNumber) {
//             System.out.println("Congo You Won the Game!!");
//             break;
//          } else if (guess > RandomNumber) {
//             System.out.println("The number is smaller than your guess!");
//          } else if (guess < RandomNumber) {
//             System.out.println("The number is greater than your guess!");
//          } else {
//             System.out.println("Any other guesses??");
//          }
//       }
//       System.out.println("Total attempts: " + attempts);
//       scanner.close();
//    }
// }

// public class Main {
//     public static void main(String[] args) {
//        new RandomNumberGame();
//        System.out.println("game over");
//     }
// }

// Practice set chapter-9
// class cylinder {
//    private int radius;
//    private int height;
//    public cylinder(int myradius, int myheight) {
//       this.radius = myradius;
//       this.height = myheight;
//    }

//    public void setradius(int myradius, int myheight) {
//       this.radius = myradius;
//       this.height = myheight;
//    }

//    public void setradius(int myradius) {
//       this.radius = myradius;
//    }

//    public int getradius() {
//       return radius;
//    }

//    public void setheight(int myheight) {
//       this.height = myheight;
//    }

//    public int getheight() {
//       return height;
//    }
//    public float volume(){
//       return (int) (Math.PI*radius*radius*height);
//    }
//    public float surfacearea(){
//       return (int) (2*Math.PI*radius*height+2*Math.PI*radius*radius);
//    }
// }

// public class Main {
//    public static void main(String[] args) {
//       cylinder mycylinder = new cylinder(8, 19);
//       // mycylinder.setradius(4);
//       // mycylinder.setheight(10);
//       System.out.println(mycylinder.getradius());
//       System.out.println(mycylinder.getheight());
//       System.out.println(mycylinder.volume() + " cm^3");
//       System.out.println(mycylinder.surfacearea() + " cm^2");
//    }
// }
// class rectangle{
//    private int lenght;
//    private int bredth;
//    public rectangle(int mylenght, int mybredth){
//       this.lenght = mylenght;
//       this.bredth = mybredth;
//    }
//    public void setlenght(int mylenght){
//       this.lenght = mylenght;
//    }
//    public int getlenght(){
//       return lenght;
//    }
//    public void setbredth(int mybredth){
//       this.bredth = mybredth;
//    } 
//    public int getbredth(){
//       return bredth;
//    }
//    public float area(){
//       return lenght*bredth;
//    }
// }
// public class Main{
//    public static void main(String[] args){
//       rectangle myRectangle = new rectangle(29, 11);
//       System.out.println(myRectangle.getlenght());
//       System.out.println(myRectangle.getbredth());
//       System.out.println(myRectangle.area());
//    }
// }
// Understanding Inheritance
// class base{
//    int x;
//    public void setX(int x){
//       System.out.println("setting the value of x: ");
//       this.x = x;
//    }
//    public int getX(){
//       return x;
//    }
//    public void printme(){
//       System.out.println("understanding inheretance");
//    }
// }
// class derived extends base{
//    int y;
//    public void setY(int y){
//       this.y = y;
//    }
//    public int getY(){
//       return y;
//    }
//    public void printme(){
//       System.out.println("child class printme");
//    }
// }
// public class Main{
//    public static void main(String[] args) {
//       derived d = new derived();
//       d.setX(69);
//       System.out.println(d.getX());
//    }
// }
// understanding constructors in inheretance
// class base{
//    base(){
//       System.out.println("I am  a constructor of base class");
//    }
// }
// class derived extends base{
//    derived(){
//       System.out.println("I am a contructor of derived class");
//    }
// }
// public class Main{
//    public static void main(String[] args) {
//       base b = new base();
//       derived d = new derived();
//    }
// }
// understanding super keyword
// class base{
//    int x;
//    base(){
//       System.out.println("i am a base class constructor");
//    }
//    base(int x){
//       System.out.println("I am a base class constructor with 1 argument "+x);
//    }
// }
// class derived extends base{
//    int y;
//    derived(){
//       System.out.println("I am a derived classs constructor");
//    }
//    derived(int x, int y){
//       super(x);
//       System.out.println("I am a derived class constructor with 2 arguments "+ x + "and "+ y);
//    }
// }
// class childofderived extends derived{
//    childofderived(){
//       System.out.println("I am a child of derived class constructor");
//    }
//    childofderived(int x, int y, int z){
//       super(x, y);
//       System.out.println("I am a child of derived class constructor with 3 arguments "+ x + " and "+ y + " and "+ z);
//    }
// }
// public class Main{
//    public static void main(String[] args) {
//       // derived d = new derived(69, 99);
//       childofderived cd = new childofderived(69, 99, 100);
//    }
// }
// public class Main{
//     public static void main(String[] args) {
//       System.out.println("hello world");
//    }

// class learning_this {
//   int x;

//   learning_this(int x) {
//     this.x = x;
//   }

//   public int returnone() {
//     return 1;
//   }
// }

// class learning_super extends learning_this {
//   learning_super(int y) {
//     super(y);
//     System.out.println("aami super constructor");
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     learning_this a = new learning_this(69);
//     learning_super b = new learning_super(9);
//     System.out.println(a.x);
//     System.out.println(b.x);
//   }
// }
// public class Main{
//   public static void main(String[] args) {
//     int x = 10;
//     for(int i = 0; i<x; i++){
//       for(int j = 0; j<=i; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }

//     for(int i = x-1; i>=0; i--){
//       for(int j = 0; j<=i; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }
// public class Main {
//   public static void main(String[] args) {
//     int x = 10;
//     for (int i = 1; i <= x; i++) {
//       for (int j = i; j <= x; j++) {
//         System.out.print(" ");
//       }
//       for (int j = 1; j <= (2 * i - 1); j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     for (int i = x ; i >= 1; i--) {
//       for (int j = x; j > i; j--) {
//         System.out.print(" ");
//       }
//       for (int j = 1; j <= (2 * i - 1); j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int rows = 3;
//         int cols = 3;
//         int[][] array = new int[rows][cols];

//         // Taking input for the 2D array
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print("Enter the value of a[" + i + "][" + j + "]: ");
//                 array[i][j] = scanner.nextInt();
//             }
//             System.out.println();
//         }

//         // Printing the 2D array
//         System.out.println("The 2D array is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }
// check whether the enterd date is valid or not 
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter day: ");
//         int day = scanner.nextInt();

//         System.out.print("Enter month: ");
//         int month = scanner.nextInt();

//         System.out.print("Enter year: ");
//         int year = scanner.nextInt();

//         System.out.println("Your Entered Date:");
//         System.out.println(day + "/" + month + "/" + year);

//         if (month >= 1 && month <= 12) {
//             if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//                 System.err.println("valid hai!!");
//             } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//                 System.err.println("month valid hai!!");
//             }else if(month == 2 && year %4 == 0){
//                 System.out.println("month valid hai");
//             }
//              else {
//                 System.err.println("invalid hai!!");
//             }
//         } else {
//             System.err.println("invalid hai!!");
//         }

//         if (day >= 1 && day <= 31) {
//             System.err.println("date Valid hai!!");
//         } else {
//             System.err.println("invalid hai!!");
//         }

//         if (year % 4 == 0) {
//             System.err.println("leap year hai!!");
//         } else {
//             System.err.println("leap year nhi hai!!");
//         }

//         scanner.close();
//     }
// }
// class Main{
//     public static void main(String[] args){
//         int i;
//         int j;
//         for(i = 0; i < 10; i++){
//             for(j = 0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num > 0) {
//             int r = num % 10;
//             sum = sum +  r;
//             num = num / 10;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }

// PATTERN PROBLEM 1

// public class Main {
//     public static void main(String[] agrs) {
//         int i, j;
//         for (i = 0; i < 5; i++) {
//             for (j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 2

// public class Main{
//     public static void main(String[] args){
//         int i = 1,j = 5, n = 5, m = 5;
//         for(i = 1; i<=n; i++){
//             for(j = 1; j<=m; j++){
//                 if(i == 1 || j == 1 || i ==n || j == m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         } 
//     }
// }

// PATTERN PROBLEM 3

// public class Main{
//     public static void main(String[] args){
//         int i, n = 5, j;
//         for(i = 0; i<n; i++){
//             for(j = 0; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 4

// public class Main{
//     public static void main(String[] args){
//         int i, n = 5, j;
//         for(i = 0; i<n; i++){
//             for(j = n; j>i; j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 5

// public class Main{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 0; i<=n; i++){
//             for(int j = 0; j<n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 6

// public class Main{
//     public static void main(String[] agrs){
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 7

// public class Main{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 8

// public class Main{
//     public static void main(String[] args) {
//         int n = 5, number = 1;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 9

// public class Main{
//     public static void main(String[] args) {
//         // int one = 1, zero = 0;
//         for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=i; j++){
//                 int sum = i+j;
//                 if(sum % 2 == 0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 10

// public class Main{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<=i; j++){
//                 System.out.print("* ");
//             }
//             for(int j = 2*(n-i); j>2; j--){
//                 System.out.print("  ");
//             }
//             for(int j = 0; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i = n; i>=1; i--){
//             for(int j = 0; j<i; j++){
//           System.out.print("* ");
//             }
//             for(int j = 2*(n-i); j>=1; j--){
//                 System.out.print("  ");
//             }
//             for(int j = n; j>n-i; j--){
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }

// PATTERN PROBLEM 11

public class Main{
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j = n; j>i+1; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}