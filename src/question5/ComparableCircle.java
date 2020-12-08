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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    /**
     *
     * @param radius
     */
    public ComparableCircle(double radius) {
        super(radius);
    }

    /**
     *
     * @param circle
     * @return
     */
    @Override 
    public int compareTo(ComparableCircle circle) {
        if (getArea() > circle.getArea()) {
            return 1;
        } else if (getArea() < circle.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     *
     * @return
     */
    @Override 
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }
}
