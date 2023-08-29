
package paises.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import paises.entidades.Pais;
import paises.services.PaisService;

/**
 *
 * @author paula
 */
public class PaisTest {
    
    private static PaisService ps;
    private static HashSet<Pais> paises;
    private static Pais pais1, pais2, pais3;
    
    public PaisTest() {
    }
    
    @Before
    public void setUp() {
        pais1 = new Pais("Mexico", 126700000);
        pais2 = new Pais("EE. UU.", 331900000);
        pais3 = new Pais("Japan", 125700000);
        paises = new HashSet<>(Arrays.asList(pais1, pais2));
        ps = new PaisService(paises);
    }
    
    @After
    public void tearDown() {
        pais1 = null;
        pais2 = null;
        pais3 = null;
        paises = null;
        ps = null;
    }

    @Test
    public void deberiaCrearPais(){
        Pais p = ps.crearPais("Arabia Saudita", 35950000);
        assertEquals("Arabia Saudita", p.getNombre());
        assertEquals(35950000, p.getHabitantes());
    }
    
    @Test
    public void deberiaAgregarPais(){
        ps.agregarPais(pais3);
        assertTrue(ps.getPaises().contains(pais3));
    }
    
    @Test
    public void deberiaEliminarPais(){
        assertTrue(ps.eliminarPais("Mexico"));
        assertFalse(ps.getPaises().contains(pais1));
    }
    
    @Test
    public void deberiaActualizarOrdenado(){
        //modificacion
        ps.agregarPais(pais3);
        assertTrue(ps.getPaisesOrdenado().contains(pais3));
        //eliminacion
        ps.eliminarPais("EE. UU.");
        assertFalse(ps.getPaisesOrdenado().contains(pais2));
    }
}
