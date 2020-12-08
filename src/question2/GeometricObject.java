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
public abstract class GeometricObject implements Colorable {

    private String color;
    private boolean isFilled;

    /**
     *
     * @param color
     * @param isFilled
     */
    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }    
    
    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public boolean isFilled() {
        return isFilled;
    }

    /**
     *
     * @param isFilled
     */
    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    /**
     *
     */
    @Override
    public void howToColor() {
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\ncolor: " + color
                + " and isFilled: " + isFilled;
    }
    
    /**
     *
     * @return
     */
    public abstract double getArea();

    
  
}
