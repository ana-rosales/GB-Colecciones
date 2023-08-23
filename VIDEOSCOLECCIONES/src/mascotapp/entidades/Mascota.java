
package mascotapp.entidades;

import java.util.Objects;

/**
 *
 * @author Ana Pau
 */
public class Mascota implements Comparable<Mascota>{
    private String nombre;
    private String apodo;
    private String raza;
    private Integer edad;

    public Mascota(String nombre, String apodo, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
    }

    public Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public Integer getEdad(){
        return edad;
    }

    /**
     * Evita que se repitan elementos por el hash'
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 9;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.apodo);
        hash = 19 * hash + Objects.hashCode(this.raza);
        hash = 19 * hash + Objects.hashCode(this.edad);
        return hash;
    }

    /**
     * Compara clase mascota con clase mascota.
     * @param obj
     * @return 
     */
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
        final Mascota other = (Mascota) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + '}';
    }

    @Override
    public int compareTo(Mascota t) {
        return t.getNombre().compareTo(this.nombre);
    }
    
    
    
    
}
