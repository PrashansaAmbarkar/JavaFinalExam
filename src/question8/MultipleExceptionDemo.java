/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class MultipleExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        // TODO code application logic here
        int array[] = new int[5];

        array[0] = 0;
        array[1] = 10;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40;

        try {
            System.out.println(array[7]);
            int divide = array[4] / array[0];
            System.out.println(divide);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("It is not possible to access elements more than the limit of the array also, it is not possible to divide a number with zero");
        }

        /*try{
               int divide= array[4]/array[0];
               System.out.println(divide);
            }
            catch(ArithmeticException e){
                System.out.println("It is not possible to divide a number with zero");
            }*/
    }

}
