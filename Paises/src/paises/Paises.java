
package paises;

import paises.services.PaisService;

/**
 *
 * @author paula
 */
public class Paises {
    
    public static void main(String[] args) {
        PaisService ps = new PaisService();
        
        ps.solicitarPaises();
        ps.ordenarAlfabeticamente();
        ps.buscarPais();
        
    }
    
}
