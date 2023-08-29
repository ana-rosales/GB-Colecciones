
package cine.tests;

import cine.entidades.Pelicula;
import cine.servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class TestsPelicula {
    
    private static ServicioPelicula sp;
    private static ArrayList<Pelicula> peliculas;
    private static Pelicula pelicula1, pelicula2, pelicula3;
    
    public TestsPelicula() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pelicula1 = new Pelicula("Amelie", "Jean-Pierre Jeunet", 1.43);
        pelicula2 = new Pelicula("WALL-E", "Andrew Stanton", 2.05);
        pelicula3 = new Pelicula("Sharkboy y Lavagirl", "Robert Rodríguez", 0.4);
        peliculas = new ArrayList<>(Arrays.asList(pelicula1,pelicula2));
        sp = new ServicioPelicula(peliculas);
        System.out.println(sp.getPeliculas().toString());
    }
    
    @After
    public void tearDown() {
        pelicula1 = pelicula2 = pelicula3 = null;
        peliculas = null;
        sp = null;
    }
    
    @Test
    public void deberiaCrearPelicula(){
        Pelicula p = sp.crearPelicula("Amelie", "Jean-Pierre Jeunet", 1.43);
        assertEquals(pelicula1.getTitulo(), p.getTitulo());
        assertEquals(pelicula1.getDirector(), p.getDirector());
        assertEquals(pelicula1.getDuracion(), p.getDuracion());        
    }
    
    @Test
    public void deberiaAgregarAlumno(){
        sp.agregarPelicula(pelicula3);
        assertEquals(pelicula3,peliculas.get(peliculas.size()-1));
    }
    
    @Test
    public void deberiaOrdenar(){
        sp.agregarPelicula(pelicula3);
        
        //duracion menor a mayor
        sp.ordenarADuracionMayor();
        System.out.println(sp.getPeliculas().toString());
        assertEquals(pelicula2, sp.ultimoElemento());
        
        //duracion mayor a menor
        sp.ordenarADuracionMenor();
        assertEquals(pelicula3, sp.ultimoElemento());
        System.out.println(sp.getPeliculas().toString());
        
        //alfabeticamente por titulo
        sp.ordenarPorTitulo();
        assertEquals(pelicula2, sp.ultimoElemento());
        System.out.println(sp.getPeliculas().toString());
        
        //alfabeticamente por director
        sp.ordenarPorDirector();
        assertEquals(pelicula3, sp.ultimoElemento());
        System.out.println(sp.getPeliculas().toString());
    }
    
    
}
