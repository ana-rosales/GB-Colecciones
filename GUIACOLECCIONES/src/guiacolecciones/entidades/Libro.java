
package guiacolecciones.entidades;

/**
 *
 * @author Ana Paula
 */
public class Libro {
    private String autor;
    private int paginas;
    private String titulo;

    public Libro(String autor, int paginas, String titulo) {
        this.autor = autor;
        this.paginas = paginas;
        this.titulo = titulo;
    }

    public Libro() {
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the paginas
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", paginas=" + paginas + ", titulo=" + titulo + '}';
    }
}
