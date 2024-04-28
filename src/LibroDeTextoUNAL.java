class LibroDeTextoUNAL extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoUNAL(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: " + facultad);
    }
}