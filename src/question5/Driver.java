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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
        ComparableCircle comparableCircle2 = new ComparableCircle(24.9);

        System.out.println("\nComparableCircle 1");
        System.out.println(comparableCircle1);
        System.out.println("\nComparableCircle 2");
        System.out.println(comparableCircle2);

        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1
                ? "\nComparableCircle 1 " : "\nComparableCircle 2 ")
                + "is the larger of the two Circles");
    }
}
