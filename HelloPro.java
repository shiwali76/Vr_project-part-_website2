import java.util.*;

/**
 * HelloPro
 */
public class HelloPro {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void sumOfInt(int a,int b){
    //     int sum = a+b;
    //     System.out.println("sum of th numbers");
    //     System.out.print(sum);
    //     return;
    // }
    // public static void factorialOfNum(int n){
    //     int fact = 1;
    //     if (n == 0){
    //         System.out.println(1);
    //         return;
    //     }
    //     else{
    //         for(int i=n;i>=1;i--){
    //             int fact = fact*i;
    //             return;
    //         }
            
    //     }
        
    // }
    // public static void factorialOfNum(int n){
    //     if(n<0){
    //         System.out.println("invailed number");
    //         return;
            
    //     }
    //     int fact = 1;
    //     for(int i=n;i>=1;i--){
    //         fact = fact*i;
            
    //     }
    //     System.out.println(fact);  
    //     return;      
    // }
    // public static void checkPrimeNum(int n){
    //     if( n%2==0){
    //         System.out.println("number is not prime");
        
    //     }
    //     else{
    //         System.out.println("prime number"+n);
    //     }
    //     return;
    // }
    public static void tableOfNum(int n){
        for(int i=1;i<=10;i++){
            // System.out.println(num+" * "+i+" = "+num*i);
            System.out.println(n*i);
        }
        return;
       
    }

    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();
        // printMyName(name);
        // sumOfInt(a, b);
        tableOfNum(n);
        
        
        
    }
}