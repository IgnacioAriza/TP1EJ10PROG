public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Geronimo Stilton", "Elizabetha Dami");
        libro.setPrecio(5000);
        libro.mostrarInformacion();
        System.out.println();

        LibroDeTexto libroDeTexto = new LibroDeTexto("Experimental Cell Research", "Catherine A. Makarewich", "Biologia");
        libroDeTexto.setPrecio(15000);
        libroDeTexto.mostrarInformacion();
        System.out.println();

        LibroDeTextoUNAL libroDeTextoUNAL = new LibroDeTextoUNAL("Historia de Colombia", "Pedro Perez", "Historia", "Facultad de Ciencias Sociales");
        libroDeTextoUNAL.setPrecio(21000);
        libroDeTextoUNAL.mostrarInformacion();
        System.out.println();

        Novela novela = new Novela("Blood Meridian", "Cormac McCarthy", "Historica");
        novela.setPrecio(8000);
        novela.mostrarInformacion();
    }
}
