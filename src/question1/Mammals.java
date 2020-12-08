/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Sai Prashansa 
 */
public class Mammals extends Animal {
    private String liveIn;

    /**
     *
     * @param name
     * @param isWarmBlooded
     * @param laysEggs
     * @param liveIn
     */
    public Mammals(String name, boolean isWarmBlooded, boolean laysEggs,String liveIn) {
        super(name, isWarmBlooded, laysEggs);
        this.liveIn = liveIn;
    }

    /**
     *
     * @return
     */
    public String getLiveIn() {
        return liveIn;
    }

    /**
     *
     * @param liveIn
     */
    public void setLiveIn(String liveIn) {
        this.liveIn = liveIn;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+ "\nMammals - " + "Lives On " + liveIn;
    }

   
    
    
    
}
