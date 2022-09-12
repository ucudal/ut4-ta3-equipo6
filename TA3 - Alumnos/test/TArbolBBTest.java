/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manoi
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }

    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        TElementoAB expResult = null;
        TElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.vaciar();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInorden() {
        System.out.println("inorden");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.inorden();
        assertEquals(expResult, result);
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

    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerNivel(unaEtiqueta);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
