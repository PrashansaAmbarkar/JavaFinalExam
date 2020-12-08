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
public class Square extends GeometricObject implements Colorable{

    private double side;

    /**
     *
     * @param side
     * @param color
     * @param isFilled
     */
    public Square(double side, String color, boolean isFilled) {
        super(color, isFilled);
        this.side = side;
    }
    
    /**
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     *
     * @return
     */
    public double getSide() {
        return side;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    /**
     *
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Side: " + side + "Area: " + getArea();
    }
}
