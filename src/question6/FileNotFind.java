/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class FileNotFind {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
      public static void main(String args[]) throws FileNotFoundException {		
          try{
          Scanner scan = new Scanner(new File("file.txt"));
          }
          catch(Exception e){
         System.out.println("Couldn't find the file");
         }
   }
}

