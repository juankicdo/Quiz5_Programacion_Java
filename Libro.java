    public class Libro {
    /* Atributos clase libro */
    private final String titulolibro;
    private final String autorlibro;
    private final int numerodepaginas;

    // Constructor
    public Libro(String titulolibro, String autorlibro, int numerodepaginas) {
        this.titulolibro = titulolibro;
        this.autorlibro = autorlibro;
        this.numerodepaginas = numerodepaginas;
    } // metodo get 

    public String getTitulolibro() {
        return titulolibro;
    }

    public String getAutorlibro() {
        return autorlibro;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }
}
// constante(O(1))

