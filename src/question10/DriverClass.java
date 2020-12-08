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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();
        SearchRecursive sr=new SearchRecursive();
        int array[]=sr.array;
        int index= sr.Search(array,0,array.length-1,num);
        if(index!=-1){
           System.out.println("The Array contains the element");
          }
        else{
            System.out.println("Array doesnot contain the element");
        }
    }
    
}
