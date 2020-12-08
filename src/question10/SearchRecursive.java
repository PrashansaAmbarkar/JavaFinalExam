/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class SearchRecursive {
    int array[]={20,1,98,34,45,80,3,100};
    
    /**
     *
     * @param array
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int Search(int array[],int a,int b,int c){
        if(b<a)
            return -1;
        if(array[a]==c)
            return 1;
        if(array[b]==c)
            return b;
        return Search(array,a+1,b-1,c);
    }
    
}
