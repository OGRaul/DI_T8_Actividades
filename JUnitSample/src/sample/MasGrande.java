/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author raul
 */
public class MasGrande {
    public static int max(int[] a){
        int m = a[0];
        int i = 0;
        
        //Informa del error si el array es null o esta vacio
        if (a == null || a.length < 0){
             System.out.println("Error: se deben introducir números");
             return m;
        }
        
        else{
            for (i = 0; i < a.length; i++) {
                if (a[i] > m) {
                    m = a[i];
                }
            }
            return m;
        }
    }
}
