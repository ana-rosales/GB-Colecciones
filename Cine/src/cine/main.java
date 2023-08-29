
package cine;

import cine.servicios.ServicioPelicula;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        
        ServicioPelicula sp = new ServicioPelicula();
        
        sp.solicitarPeliculas();
        sp.mostrarPeliculas();
        sp.ordenarADuracionMayor();
        sp.mostrarPeliculas();
        sp.ordenarADuracionMenor();
        sp.mostrarPeliculas();
        sp.ordenarPorTitulo();
        sp.mostrarPeliculas();
        sp.ordenarPorDirector();
        sp.mostrarPeliculas();
        
    }
    
}
