public class LibroDigital {
    /*
    3 — Registro de Libros Digitales (E-books)

Contexto

Las librerías y bibliotecas virtuales administran catálogos de publicaciones electrónicas donde se
controla la cantidad de descargas y el tamaño en megabytes que ocupan.

Consigna

Modelar una entidad en Java que represente un libro digital, permitiendo simular descargas y calcular
el espacio total ocupado en un servidor.

Desarrollo requerido

Definir la clase LibroDigital con atributos isbn (String), titulo (String), tamanioMB (double) y descargasTotales (int).

Incorporar un constructor que inicialice los datos y métodos getters y setters con validaciones para evitar
valores negativos en el tamaño o descargas.

Implementar un método registrarDescarga() que incremente en uno el contador de descargas, y
un método calcularEspacioConsumido() que retorne el producto entre el tamaño y las descargas totales.

En el método main, crear un objeto LibroDigital, simular varias descargas consecutivas y mostrar el
almacenamiento total consumido en consola.
     */

    private String isbn;
    private String titulo;
    private double tamanioMB;
    private int descargasTotales;

    public LibroDigital(String isbn, String titulo, double tamanioMB, int descargasTotales) {

        if (tamanioMB < 0) {
            throw new IllegalArgumentException("El tamaño no puede ser negativo.");
        }

        if (descargasTotales < 0) {
            throw new IllegalArgumentException("Las descargas no pueden ser negativas.");
        }

        this.isbn = isbn;
        this.titulo = titulo;
        this.tamanioMB = tamanioMB;
        this.descargasTotales = descargasTotales;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    public void setTamanioMB(double tamanioMB) {
        if (tamanioMB >= 0) {
            this.tamanioMB = tamanioMB;
        }
    }

    public int getDescargasTotales() {
        return descargasTotales;
    }

    public void setDescargasTotales(int descargasTotales) {
        if (descargasTotales >= 0) {
            this.descargasTotales = descargasTotales;
        }
    }

    public void registrarDescarga() {
        descargasTotales++;
    }

    public double calcularEspacioConsumido() {
        return tamanioMB * descargasTotales;
    }

}
