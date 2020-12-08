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
public class Reptiles extends Animal {
    private String repType;
    private String Skintype;

    /**
     *
     * @param name
     * @param isWarmBlooded
     * @param laysEggs
     * @param repType
     * @param Skintype
     */
    public Reptiles(String name, boolean isWarmBlooded, boolean laysEggs,String repType, String Skintype) {
        super(name, isWarmBlooded, laysEggs);
        this.repType = repType;
        this.Skintype = Skintype;
    }

    /**
     *
     * @return
     */
    public String getRepType() {
        return repType;
    }

    /**
     *
     * @param repType
     */
    public void setRepType(String repType) {
        this.repType = repType;
    }
   
    /**
     *
     * @return
     */
    public String getSkintype() {
        return Skintype;
    }

    /**
     *
     * @param Skintype
     */
    public void setSkintype(String Skintype) {
        this.Skintype = Skintype;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+"\nReptiles - " + "Reptile Type: " + repType + "\nSkin type: " + Skintype;
    }
    
    
    
}
