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
public abstract class Animal{
    private String name;
    private boolean isWarmBlooded;
    private boolean laysEggs;

    /**
     *
     * @param name
     * @param isWarmBlooded
     * @param laysEggs
     */
    public Animal(String name, boolean isWarmBlooded, boolean laysEggs) {
        this.name = name;
        this.isWarmBlooded = isWarmBlooded;
        this.laysEggs = laysEggs;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public boolean isIsWarmBlooded() {
        return isWarmBlooded;
    }

    /**
     *
     * @return
     */
    public boolean isLaysEggs() {
        return laysEggs;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param isWarmBlooded
     */
    public void setIsWarmBlooded(boolean isWarmBlooded) {
        this.isWarmBlooded = isWarmBlooded;
    }

    /**
     *
     * @param laysEggs
     */
    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Animal " +"Name: " + name + "\nIs it warm blooded: " + isWarmBlooded + "\nDoes it lay Eggs: " + laysEggs;
    }
    
    
    
    
}
