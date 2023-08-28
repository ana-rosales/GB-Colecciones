package alumnos.servicios;

import alumnos.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * @author paula
 */
public class ServicioAlumno {

    private static Scanner ent;
     private ArrayList<Alumno> alumnos;

    public ServicioAlumno() {
        ent = new Scanner(System.in);
        alumnos = new ArrayList<>();
    }

    public ServicioAlumno(ArrayList<Alumno> alumnos) {
        ent = new Scanner(System.in);
        this.alumnos = alumnos;
    }
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    /**
     * Metodo que solicita alumnos para ingresarlos en una lista.
     */
    public void solicitarAlumnos() {
        boolean seguir;
        do {
            seguir = false;
            agregarAlumno(crearAlumno(solicitarNombre(),solicitarNotas()));
            seguir = continuar();
        } while (seguir);
    }

    /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main.
     */
    public void notaFinal() {
        System.out.println("\nBUSCANDO ALUMNO\n");
        String nombre = solicitarNombre();
        Alumno a = buscarAlumno(nombre);
        if (a != null) {
            double promedio = a.promedioFinal();
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se encontró al alumno.");
        }
    }
 
    /**
     * Metodo que muestra todos los alumnos en la lista.
     */
    public void mostrarAlumnos() {
        System.out.println("\nMOSTRANDO ALUMNOS\n");
        Iterator<Alumno> it = getAlumnos().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Metodo que crea un alumno.
     * Se puede probar que cree correctamente al alumno.
     * @param nombre
     * @param notas
     * @return el alumno creado
     */
    public Alumno crearAlumno(String nombre, ArrayList<Integer> notas) {
        return new Alumno(nombre,notas);
    }
    
    /**
     * Metodo que agrega un alumno a la lista de alumnos.
     * Se puede probar que agregue correctamente al alumno.
     * @param a 
     */
    public void agregarAlumno(Alumno a){
        getAlumnos().add(a);
    }

    /**
     * Metodo que busca a un alumno en la lista de alumnos.
     * Es necesario probar si si devuelve algun alumno.
     * @param nombre
     * @return primera coincidencia de alumno o null si no lo encuentra
     */
    public Alumno buscarAlumno(String nombre) {
        Iterator<Alumno> it = getAlumnos().iterator();
        boolean encontrado = false;
        Alumno a = null;
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                a = next;
                break;
            }
        }
        return a;
    }
  
    /**
     * Metodo que le pregunta al usuario si quiere seguir ingresando alumnos.
     * @return si quiere continuar o no
     */
    public boolean continuar() {
        System.out.print("¿Desea continuar? S/N: ");
        return ent.nextLine().equalsIgnoreCase("S");
    }
  
    /**
     * Metodo que solicita el nombre del alumno.
     * @return el nombre
     */
    public String solicitarNombre(){
        System.out.print("Ingrese el nombre: ");
        return ent.nextLine();
    }
    
    /**
     * Metodo que le solicita las calificaciones del alumno.
     * @return lista de 3 notas
     */
    public ArrayList<Integer> solicitarNotas(){
        ArrayList<Integer> notas = new ArrayList<>();
        System.out.println("Ingrese las notas (ENTEROS):");
        for (int i = 0; i < 3; i++) {
            System.out.print("\tIngrese la nota " + i + ": ");
            notas.add(ent.nextInt());
            ent.nextLine();
        }
        return notas;
    }

}
