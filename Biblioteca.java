import java.util.LinkedList;

public class Biblioteca {
LinkedList<Libro> librosDisponibles;

    public Biblioteca() {
        librosDisponibles = new LinkedList<>();
    }
    
    // Método para registrar un libro
    public void registrarLibro(String titulo, String autor, int numPaginas) {
        Libro nuevoLibro = new Libro(titulo, autor, numPaginas);
        librosDisponibles.add(nuevoLibro);
    }
    // complejidad constante (O(1))
    // Método para mostrar todos los libros disponibles
    public void mostrarLibrosDisponibles() {
        for (Libro libro : librosDisponibles) {
            System.out.println("Título: " + libro.getTitulolibro());
            System.out.println("Autor: " + libro.getAutorlibro());
            System.out.println("Número de Páginas: " + libro.getNumerodepaginas());
            System.out.println("-----------------------------");
        }
    }
}
