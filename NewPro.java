import java.util.*;

/**
 * NewPro
 * 
 * Enter 3 numbers from the user & make a function to print their average.
Write a function to print the sum of all odd numbers from 1 to n.
Write a function which takes in 2 numbers and returns the greater of those two.
Write a function that takes in the radius as input and returns the circumference of a circle.
Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

 */
public class NewPro {
    // public static void sumOfThree(int a,int b,int c){
    //     int ave = (a+b+c)/3;
    //     System.out.println("average og three numbers are:"+ave);
    //     return;
    // }

    // public static void funOodNum(int n){
    //     int sum = 0;
    //     for (int i=1;i<=n;i++){
    //         if (i%2!=0) {
    //             sum += i;
    //             System.out.println("sum of all odd num is:"+sum);
                
    //         }
    //     }
    //     return;

    // }
    // public static void greaterOfTwo(int a, int b){
    //     if (a>b) {
    //         System.err.println("The a is greater than b");
            
    //     }
    //     else{
    //         System.out.println("b is greater than a");
    //     }
    // }
    // public static void radiusOfCircum(int r){
    //     double pi = Math.PI;

    //     System.out.println("circumference of circle is:"+2*pi*r);
    //     System.out.println("area of circle is:"+pi*r*r);
    //     return;
    // }
    // public static void ageAligibleVote(int n){
    //     if (n>=18) {
    //         System.out.println("you are eligible to vote");
            
    //     }
    //     else{
    //         System.out.println("you are not eligible");
    //     }
    // }
    public static void numAsMuchWant(int n){
        if (n<0) {
            System.out.println("negtive number");
            
        }
        else if (n>0) {
            System.out.println("positive number");
            
        }
        else{
            System.out.println("equal to zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the first number:");
        // int a = sc.nextInt();
        // System.out.println("enter the scond number:");
        
        int n = sc.nextInt();
        // sumOfThree(a, b, c)
        numAsMuchWant(n);

    }

    
}