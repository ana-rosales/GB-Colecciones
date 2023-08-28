
package alumnos;

import alumnos.servicios.ServicioAlumno;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        ServicioAlumno sa = new ServicioAlumno();
        sa.solicitarAlumnos();
        sa.mostrarAlumnos();
        sa.notaFinal();        
    }
    
}
