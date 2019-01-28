/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660lab1q42;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josh Singh
 */
public class Listing {
        public static void arrayReversal() {
     
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter 3 values");
    int arrayListing[] = new int[3];
    for (int i = 0; i < arrayListing.length; i++ ) {
        arrayListing[i] = Scanner.nextInt();
    }
    
    System.out.print("\nCurrent Array is: ");
    System.out.println(Arrays.toString(arrayListing));

     for (int i = 0; i < arrayListing.length / 2; i++) {
         int temp = arrayListing[i];
         arrayListing[i] = arrayListing[arrayListing.length - 1 - i];
         arrayListing[arrayListing.length - 1 - i] = temp;
      }
    
    System.out.print("\nReversed Array is: ");
    System.out.println(Arrays.toString(arrayListing));

    } 
}
