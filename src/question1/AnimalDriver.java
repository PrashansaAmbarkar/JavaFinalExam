/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal=new Animal("Tiger",true,false) {};
        System.out.println(animal.toString());
        System.out.println("*********************");
        Animal animal1=new Mammals("Lion",true,false,"Land");
        System.out.println(animal1.toString());
        System.out.println("*********************");
        Animal animal2=new Reptiles("Alligators",false,true,"Crocodilia","Scale Skin");
        System.out.println(animal2.toString());
    }
    
}
