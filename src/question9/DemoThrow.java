/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class DemoThrow {

    /**
     */
    public static void functionDemo() 
    { 
        try
        { 
            throw new NullPointerException("Throw exception"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Catch inside functionDemo"); 
            throw e; 
        } 
    } 
  
    /**
     *
     * @param args
     */
    public static void main(String args[]) 
    { 
        try
        { 
            functionDemo(); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Catch oustide the functionDemo i.e Catch in the main"); 
        } 
    } 
} 
