/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perros.tests;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import perros.services.ServicioPerro;

/**
 *
 * @author paula
 */
public class PerroTests {
    
    private static ServicioPerro sp;
    private static ArrayList<String> razas;
    
    public PerroTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        razas = new ArrayList<>(Arrays.asList("Collie","Cocker","Golden"));
        sp = new ServicioPerro(razas);
    }
    
    @AfterClass
    public static void tearDownClass() {
        sp = null; 
        razas = null;
    }
    
    @Test
    public void deberiaIterar(){
        sp.mostrarRazas();
        assertEquals("Golden", sp.mostrarRazas());
    }
       
    @Test
    public void deberiaBuscarRaza(){
        assertTrue(sp.buscarRaza("Golden"));
        assertFalse(sp.buscarRaza("Callejero"));
    }
    
    @Test
    public void deberiaOrdenar(){
        sp.ordenarRazas();
        assertEquals("Golden",sp.ultimaRaza());
    }
    
}
