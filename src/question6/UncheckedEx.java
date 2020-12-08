/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class UncheckedEx {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

      int Array[] = new int[3];
    
      Array[0] = 40;
      Array[1] = 8;
      Array[2] = 13;
      Array[3] = 96;
     
      //Trying to print the element which is greater than the array length 
      System.out.println( Array[8]);
   }
}
