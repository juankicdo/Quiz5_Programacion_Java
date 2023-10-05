public class Principal {
    public static void main(String[] args) {
            // Crear la biblioteca
            Biblioteca bibliotecaKonradLorenz = new Biblioteca();

            // Crear y registrar los libros en la biblioteca
            // constante (O(1))
            bibliotecaKonradLorenz.registrarLibro("Cien años de soledad", "Gabriel García Márquez", 496);
            bibliotecaKonradLorenz.registrarLibro("El código Da Vinci", "Dan Brown", 656);
            bibliotecaKonradLorenz.registrarLibro("1984", "George Orwell", 326);
            bibliotecaKonradLorenz.registrarLibro("El Hobbit", "J.R.R. Tolkien", 310);
            bibliotecaKonradLorenz.registrarLibro("La Odisea", "Homero", 448);

            // Mostrar los libros disponibles en la biblioteca
            System.out.println("Libros disponibles en la biblioteca Konrad Lorenz:");
            bibliotecaKonradLorenz.mostrarLibrosDisponibles();
        }
    }


