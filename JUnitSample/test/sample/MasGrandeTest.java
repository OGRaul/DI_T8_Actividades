/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raul
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMax() {
        System.out.println("Prueba Max normal");
        int[] a = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;
        int expResult = 5;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaxOrder() {
        System.out.println("Prueba Max orden");
        int[] a = new int[3];
        a[0] = 4;
        a[1] = 5;
        a[2] = 3;
        int expResult = 5;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    //Este devuelve siempre 0 en lugar de el resultado esperado
    @Test
    public void testMaxSingleNumberArray() {
        System.out.println("Prueba Max sol un numero");
        int[] a = new int[1];
        a[0] = 3;
        int expResult = 3;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    //Devuelve 0 en lugar de el resultado esperado si solo hay 1 numero positivo o ningun numero positivo
    @Test
    public void testMaxNegativeNumbers() {
        System.out.println("Prueba Max numeros negativos");
        int[] a = new int[3];
        a[0] = -3;
        a[1] = -4;
        a[2] = -5;
        int expResult = -3;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaxEmpty() {
        System.out.println("Prueba Max vacio");
        int[] a = new int[0];
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    //TODO: No se que hacer con esto, que resultado deberiamos esperar si no un fallo sobre el sistema? creo control de errores??
    @Test
    public void testMaxNull() {
        System.out.println("Prueba Max array null");
        int[] a = null;
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
}
