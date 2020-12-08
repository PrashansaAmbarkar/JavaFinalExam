/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class RecursiveEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        int answer = factorial(num);
        System.out.println("Factorial of the given number is: " + answer);
    }

    /**
     *
     * @param number
     * @return
     */
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }
}
