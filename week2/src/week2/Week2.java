/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;
import java.util.Scanner; //Needed for user input
/**
 *
 * @author wrl123u
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner josh = new Scanner(System.in); //josh is name of instance
        int hours;
        double payrate;
       
        System.out.println("Enter the hours as a intger ==> ");
        hours = josh.nextInt();
        
        System.out.println("Enter the pay rate as decimal ==> ");
        payrate = josh.nextDouble();
        
      //  double payment = hours*payrate;
        
      System.out.println("the payment is ==> " + CalcPay(hours,payrate));
      

    }
    
    static double CalcPay(int h, double pr) {
     // return (h > 40) ? "You are working overtime" : "The payment is" + h * pr;
     if (h < 40) {
     return h*pr; 
    } else {
     return (40*pr)+(h-40)*(pr*1.5); 
     }
    }
}
