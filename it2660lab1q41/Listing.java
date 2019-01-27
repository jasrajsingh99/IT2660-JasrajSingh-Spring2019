
package it2660lab1q41;
import java.util.Scanner;
/**
 *
 * @author Josh Singh
 */
public class Listing{
     public static void userName() {
        
        System.out.print("Input Name: ");
        Scanner nameinput = new Scanner(System.in);
        System.out.println("Name: " + nameinput.nextLine() + "\n ");
     }
          public static void userAge() {
        
        System.out.print("Input Age: ");
        Scanner age = new Scanner(System.in);
        System.out.println("Age: " + age.nextLine()); 
    
     }
     
}
