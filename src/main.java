public class main {
    static void main(String[] args) {
        LibroDigital libro = new LibroDigital(
                "978-1234567890",
                "The Hungers Games",
                25.5,
                0
        );

        libro.registrarDescarga();
        libro.registrarDescarga();
        libro.registrarDescarga();
        libro.registrarDescarga();

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Descargas: " + libro.getDescargasTotales());
        System.out.println("Espacio consumido: " + libro.calcularEspacioConsumido() + " MB");
    }

}
