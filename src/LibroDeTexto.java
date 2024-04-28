class LibroDeTexto extends Libro {
    private String curso;

    public LibroDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso: " + curso);
    }
}