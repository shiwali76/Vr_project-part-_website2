import java.util.*;
import java.lang.Math;

import javax.swing.plaf.TreeUI;


/**
 * NewFunction
 * Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
 * Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.


 */
public class NewFunction {
    public static void findValue(int x,int n){
            if (n==0) {
                              
            }
            else{
                return x*power(x,n-1);
            }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int result = power(x,n);
        findValue(x, n);
        
        // int neg_count = 0;
        // int pos_count = 0;
        // int zero_count = 0;

        // while (true) {
        //     System.out.println("Enter the number or(done for the finsh the number)");
        //     if (sc.hasNextInt()) {
        //         int n = sc.nextInt();

        //         if (n<0) {
        //             neg_count += 1;
            
                    
        //            }
        //            else if (n>0) {
        //             pos_count += 1;
                    
        //            }
            
        //            else{
        //             zero_count += 1;
            
        //            }
                
        //     }
        //     else{
        //         String input = sc.next();
        //         if (input.equalsIgnoreCase("done")) {
        //             break;
                    
        //         }
        //         else{
        //             System.out.println("invailed syntex");
        //         }
        //     }
            
            
        }
    }

}