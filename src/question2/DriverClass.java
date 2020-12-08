/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class DriverClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        GeometricObject[] squares = {new Square(4.5, "Black", true), new Square(10, "Brown", false),
            new Square(6.4, "Yellow", false), new Square(15, "Orange", true), new Square(23.4, "Green", true)};

        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare(" + (i + 1) + ")");
            System.out.println("Area: " + squares[i].getArea());
            if (!squares[i].isFilled()) {
                squares[i].howToColor();
            }else{
                System.out.println("Square is colored with: "+squares[i].getColor());
            }
        }
    }
}
