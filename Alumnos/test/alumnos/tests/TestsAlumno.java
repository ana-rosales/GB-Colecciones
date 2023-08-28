
package alumnos.tests;

import alumnos.entidades.Alumno;
import alumnos.servicios.ServicioAlumno;
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
public class TestsAlumno {
    
    private static ServicioAlumno sa;
    private static ArrayList<Alumno> alumnos;
    private static ArrayList<Integer> notas1arr, notas2arr, notas3arr;
    private static Alumno alumno1, alumno2, alumno3;
    
    public TestsAlumno() {
    }
    
    @Before
    public void setUp() {
        notas1arr = new ArrayList<>(Arrays.asList(10, 9, 8));
        notas2arr = new ArrayList<>(Arrays.asList(9, 8, 7));
        notas3arr = new ArrayList<>(Arrays.asList(8, 9, 0));
        alumno1 = new Alumno("Ana Pau", notas1arr);
        alumno2 = new Alumno("Axel", notas2arr);
        alumno3 = new Alumno("Vik", notas3arr);
        alumnos = new ArrayList<>(Arrays.asList(alumno1,alumno2));
        sa = new ServicioAlumno(alumnos);
        System.out.println(sa.getAlumnos().toString());
    }
    
    @After
    public void tearDown() {
        sa = null;
        alumnos = null;
        notas1arr = notas2arr = notas3arr = null;
        alumno1 = alumno2 = alumno3 = null;
    }
    
    @Test
    public void deberiaCrearAlumno(){
        Alumno a = sa.crearAlumno("Ana Pau", notas1arr);
        assertEquals(alumno1.getNombre(), a.getNombre());
        assertEquals(alumno1.getNotas(), a.getNotas());
    }
    
    @Test
    public void deberiaBuscarAlumno(){
        assertEquals(alumno1,sa.buscarAlumno("Ana Pau"));
        assertEquals(alumno2,sa.buscarAlumno("axeL"));
        assertNull(sa.buscarAlumno("vIK"));
    }
    
    @Test
    public void deberiaAgregarAlumno(){
        sa.agregarAlumno(alumno3);
        assertEquals(alumno3,alumnos.get(alumnos.size()-1));
    }
    
    public void deberiaCalcularPromedio(){
        assertEquals(9.0,alumnos.get(0).promedioFinal(),0);
        assertEquals(8.0,alumnos.get(1).promedioFinal(),0);
    }
    
}
