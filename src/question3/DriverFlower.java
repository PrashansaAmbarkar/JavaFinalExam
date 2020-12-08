/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class DriverFlower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flower flower= new Flower();
        Sunflower sf=new Sunflower();
        
        System.out.println(flower.color());
        System.out.println(flower.fragrance());
        
        System.out.println("\n***Implicit Casting***");
        flower=sf;  // subclass to parent class, it is valid
        System.out.println(flower.color());
        System.out.println(flower.fragrance());
        
        System.out.println("\n***Explicit Casting***");
        sf=(Sunflower)flower;// explicit casting
        System.out.println(flower.color());
        System.out.println(flower.fragrance());
    }
    
}
