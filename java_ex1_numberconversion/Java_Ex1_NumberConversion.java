/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #1
 * Write a program that reads an integer and prints it in binary, octal, 
 * and hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 */
package java_ex1_numberconversion;

import java.util.Scanner;

/**
 * @author jhonatan
 */
public class Java_Ex1_NumberConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int value = scan.nextInt();
        System.out.printf("Value in Binary: %s%n",Integer.toString(value,2)); // Print number as a binary
        System.out.printf("Value in Octal: %o%n",value); // Print number as a octal
        System.out.printf("Value in Hexa: %x%n",value); // Print number as a hexadeximal
        
        float reciprocal = (float) 1/value;
        System.out.printf("Value in Hexa floating-point: %a%n",reciprocal); // Print number as a hexadeximal floating-point
    }
    
}
