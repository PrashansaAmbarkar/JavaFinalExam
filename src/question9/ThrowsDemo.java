/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class ThrowsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ArithmeticException  {
        // TODO code application logic here
        int number1= 20;        
        try {
            System.out.println(number1/0);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide with zero. Exception found");
        }
    }
    
}
