
package paises.entidades;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author paula
 */
public class Pais {
    private String nombre;
    private int habitantes;

    public Pais(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + this.habitantes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (this.habitantes != other.habitantes) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", habitantes=" + habitantes + '}';
    }
    
    public static Comparator<Pais> compararNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
}
