/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Circle extends GeometricObject {

    private double radius;

    /**
     *
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     *
     * @return
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nRadius is " + radius;
    }
}
