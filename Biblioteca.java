
public class Biblioteca {

    /*
     * Biblioteca: Guarda los libros en 4 arrays.
     * Como maximo tendrá 100 libros.
     * Cada posición de los arrays corresponde a los datos de un libro.
     * Por ejemplo:
     * la posición 0 del array de títulos contiene: "El Quijote"
     * la posición 0 del array de autores contiene: "Cervantes"
     * la posición 0 del array de isbns contiene: "978-84-15474-01-1"
     * la posición 0 del array de numPaginas contiene: 863
     * la posición 0 del array de generosLiterarios contiene: "Novela"
     * 
     * 
     * Encapsula los arrays de la clase Biblioteca en una clase y
     * refactoriza los metodos de la clase Biblioteca.
     * 
     */

    public class Biblioteca {
        private String nombrebiblioteca;
        private Libro[] listadeLibros;

    }

    public Biblioteca(String nombrebiblioteca) {
        this.nombrebiblioteca = nombrebiblioteca;
        listadeLibros = new Libro[100];
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public void añadirLibro(Libro libro) {

        boolean añadida = false;
        // bucle for recorre la agenda para saber si,
        for (int i = 0; i < listadeLibros.length; i++) {
            // aqui en el if buscar la posicion que este vacia o null
            if (listadeLibros[i] == null) {
                // asi asignar a esa posicion en la agenda el numero de telefono
                // que estamos introduciendo
                listadeLibros[i] = libro;
                // al cumplirse la condicion(tener un espacio vacio)
                // añadida que seria el boleano es true.
                añadida = true;
                // el break es porque no necesito buscar màs espacios vacios o seguir haciendo
                // el bucle
                break;
            }

        }
        if (!añadida) {
            System.out.println("Libro no añadido");
        } else {
            System.out.println("libro agregado");
        }
    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String isbn) {
        boolean eliminada = false;
        for (int i = 0; i < listadeLibros.length; i++) {
            if (listadeLibros[i] != null && listadeLibros[i].getISBNS().equals(isbn)) {
                listadeLibros[i] = null;
                eliminada = true;
                break;
            }
        }

    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        for (int i = 0; i < listadeLibros.length; i++) {
            Libro libro = listadeLibros[i];
            if (libro != null) {
                System.out.println(libro.toString());
            }
        }

    }

    public Libro[] obtenerLibrosGeneros(String genero) {
        Libro[] libros = new Libro[100];
        int contador = 0;
        for (int i = 0; i < listadeLibros.length; i++) {
            if (listadeLibros[i] != null && listadeLibros[i].getGenero().equals(genero)) {
                libros[contador] = listadeLibros[i];
                contador++;
            }
        }
        return libros;
    }

    // poesia
    public Libro[] obtenerLibrosPoesia() {
        return obtenerLibrosGeneros("Poesia");
    }

    public int existeLibro(String nombreLibro) {
        for (int i = 0; i < listadeLibros.length(); i++) {
            if (listadeLibros[i] != null) {
                if (listadeLibros[i].getNombre().equals(nombreLibro)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Nos devuelve un array con los titulos de los libros de un autor
    public void mostrarlibrosDeAutor(String autor) {
        int x = existeLibro(autor);
        if (x != -1) {
            listadeLibros[x] = librosDeAutor();
        } else {
            System.out.println("Libro no existe");
        }
    }

    // Nos devuelve el titulo del libro con mas paginas
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo = "";
        for (int i = 0; i < 100; i++) {
            if (numPaginas[i] > max) {
                max = numPaginas[i];
                titulo = titulos[i];
            }
        }
        System.out.println("El libro mas largo es: " + titulo);
    }

}
