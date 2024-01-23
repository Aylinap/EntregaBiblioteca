
public class Libro {
    private String nombre;
    private String autor;
    private String ISBNS;
    private int numPaginas;
    private String generosLiterarios;

    public Libro(String nombre, String autor, String iSBNS, int numPaginas, String generosLiterarios) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBNS = iSBNS;
        this.numPaginas = numPaginas;
        this.generosLiterarios = generosLiterarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBNS() {
        return ISBNS;
    }

    public void setISBNS(String iSBNS) {
        ISBNS = iSBNS;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenerosLiterarios() {
        return generosLiterarios;
    }

    public void setGenerosLiterarios(String generosLiterarios) {
        this.generosLiterarios = generosLiterarios;
    }

    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", ISBNS=" + ISBNS + ", numPaginas=" + numPaginas
                + ", generosLiterarios=" + generosLiterarios + "]";
    }
}
