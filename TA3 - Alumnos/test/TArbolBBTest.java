/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author manoi
=======
 * @author Ikken
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }

<<<<<<< HEAD
=======
    /**
     * Test of insertar method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        TElementoAB expResult = null;
        TElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciar method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.vaciar();
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorden method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testInorden() {
        System.out.println("inorden");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.inorden();
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerAlturaVacio() {
        System.out.println("obtenerAltura vacío");
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerAltura0() {
        System.out.println("obtenerAltura 0");
        TArbolBB instance = new TArbolBB();
                instance.insertar(new TElementoAB<Integer>(3,null));
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerAltura1() {
        System.out.println("obtenerAltura 1");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB<Integer>(3,null));
        instance.insertar(new TElementoAB<Integer>(1,null));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerAltura1xDerecha() {
        System.out.println("obtenerAltura 1 por derecha");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB<Integer>(3,null));
        instance.insertar(new TElementoAB<Integer>(5,null));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
        
    @Test
    public void testObtenerAltura1xIzqDer() {
        System.out.println("obtenerAltura x izq der");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB<Integer>(10,null));
        instance.insertar(new TElementoAB<Integer>(7,null));
        instance.insertar(new TElementoAB<Integer>(12,null));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
   
     @Test
    public void testObtenerAltura2Izq() {
        System.out.println("obtenerAltura x izq");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB<Integer>(7,null));
        instance.insertar(new TElementoAB<Integer>(4,null));
        instance.insertar(new TElementoAB<Integer>(2,null));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerAltura2DerIzq() {
        System.out.println("obtenerAltura x der izq");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB<Integer>(7,null));
        instance.insertar(new TElementoAB<Integer>(10,null));
        instance.insertar(new TElementoAB<Integer>(8,null));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerAltura2IDDI() {
        System.out.println("obtenerAltura x izq der der izq");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB<Integer>(20,null));
        instance.insertar(new TElementoAB<Integer>(10,null));
        instance.insertar(new TElementoAB<Integer>(15,null));
        instance.insertar(new TElementoAB<Integer>(12,null));
        int expResult = 3;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
         
    
    
                
    @Test
    public void testObtenerTamanio() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAltura method, of class TArbolBB.
     */
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTamanio method, of class TArbolBB.
     */
    @Test
    public void testObtenerTamanio0() {
        System.out.println("obtenerTamanio0");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio1() {
        System.out.println("obtenerTamanio1");
        TArbolBB instance = new TArbolBB();
        TElementoAB<Integer> elemento = new TElementoAB(4, null);
        instance.insertar(elemento);
        int expResult = 1;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio2A() {
        System.out.println("obtenerTamanio2");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 2;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio2B() {
        System.out.println("obtenerTamanio2");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(3, null));
        instance.insertar(new TElementoAB(4, null));
        int expResult = 2;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio3A() {
        System.out.println("obtenerTamanio3");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(1, null));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio3B() {
        System.out.println("obtenerTamanio3");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio3C() {
        System.out.println("obtenerTamanio3");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(5, null));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio3D() {
        System.out.println("obtenerTamanio3");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(5, null));
        instance.insertar(new TElementoAB(7, null));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testObtenerTamanio3E() {
        System.out.println("obtenerTamanio3");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(7, null));
        instance.insertar(new TElementoAB(5, null));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of obtenerNivel method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerNivel(unaEtiqueta);
        assertEquals(expResult, result);
<<<<<<< HEAD
        fail("The test case is a prototype.");
    }

=======
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantidadHojas method, of class TArbolBB.
     */
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
<<<<<<< HEAD
=======
        // TODO review the generated test code and remove the default call to fail.
>>>>>>> 7e0698351d6ae4516fd6ee092ec59cee230d794b
        fail("The test case is a prototype.");
    }
    
}
