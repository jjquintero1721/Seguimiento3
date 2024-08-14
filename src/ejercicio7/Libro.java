package ejercicio7;

import javax.swing.*;

import java.util.Date;
import javax.swing.JOptionPane;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private static int añoPublicacion;
    private String editorial;
    private int numPaginas;
    private String[] temas;

    private static Libro[] libros = new Libro[10];
    private static Usuario[] usuarios = new Usuario[10];
    private static Prestamo[] prestamos = new Prestamo[10];
    private static int totalLibros = 0;
    private static int totalUsuarios = 0;
    private static int totalPrestamos = 0;

    public Libro(String isbn, String titulo, String autor, int añoPublicacion, String editorial, int numPaginas, String[] temas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.temas = temas;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAñoPublicacion() { return añoPublicacion; }
    public void setAñoPublicacion(int añoPublicacion) { this.añoPublicacion = añoPublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public int getNumPaginas() { return numPaginas; }
    public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }

    public String[] getTemas() { return temas; }
    public void setTemas(String[] temas) { this.temas = temas; }

    public static void registrarLibro() {
        if (totalLibros < libros.length) {
            String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
            String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
            String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
            int añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación:"));
            String editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro:");
            int numPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de páginas:"));
            String temasStr = JOptionPane.showInputDialog("Ingrese los temas o categorías separados por comas:");
            String[] temas = temasStr.split(",");

            Libro nuevoLibro = new Libro(isbn, titulo, autor, añoPublicacion, editorial, numPaginas, temas);
            libros[totalLibros++] = nuevoLibro;
            JOptionPane.showMessageDialog(null, "Libro registrado: " + titulo);
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad de libros alcanzada.");
        }
    }

    public static void registrarUsuario() {
        if (totalUsuarios < usuarios.length) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
            String id = JOptionPane.showInputDialog("Ingrese la identificación del usuario:");
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del usuario:");

            Usuario nuevoUsuario = new Usuario(nombre, id, telefono);
            usuarios[totalUsuarios++] = nuevoUsuario;
            JOptionPane.showMessageDialog(null, "Usuario registrado: " + nombre);
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad de usuarios alcanzada.");
        }
    }

    public static Libro buscarLibroPorISBN(String isbn) {
        for (int i = 0; i < totalLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)) {
                return libros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Libro no encontrado.");
        return null;
    }

    public static void prestarLibro() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            String idUsuario = JOptionPane.showInputDialog("Ingrese la identificación del usuario:");
            Usuario usuario = buscarUsuarioPorID(idUsuario);
            if (usuario != null) {
                prestamos[totalPrestamos++] = new Prestamo(isbn, idUsuario, new Date());
                JOptionPane.showMessageDialog(null, "Préstamo registrado para el libro: " + libro.getTitulo());
            }
        }
    }

    public static void devolverLibro() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String idUsuario = JOptionPane.showInputDialog("Ingrese la identificación del usuario:");
        for (int i = 0; i < totalPrestamos; i++) {
            if (prestamos[i].getIsbnLibro().equals(isbn) && prestamos[i].getIdUsuario().equals(idUsuario)) {
                prestamos[i].devolver();
                JOptionPane.showMessageDialog(null, "Libro devuelto: " + buscarLibroPorISBN(isbn).getTitulo());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Préstamo no encontrado.");
    }

    public static Usuario buscarUsuarioPorID(String id) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].getIdentificacion().equals(id)) {
                return usuarios[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        return null;
    }

    public static void consultarPrestamosPorUsuario() {
        String idUsuario = JOptionPane.showInputDialog("Ingrese la identificación del usuario:");
        StringBuilder prestamosInfo = new StringBuilder("Libros prestados por el usuario: " + idUsuario + "\n");
        for (int i = 0; i < totalPrestamos; i++) {
            if (prestamos[i].getIdUsuario().equals(idUsuario) && prestamos[i].getFechaDevolucion() == null) {
                prestamosInfo.append(buscarLibroPorISBN(prestamos[i].getIsbnLibro()).getTitulo()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, prestamosInfo.toString());
    }

    public static void imprimirTodosLosLibros() {
        StringBuilder librosInfo = new StringBuilder("Lista de todos los libros:\n");
        for (int i = 0; i < totalLibros; i++) {
            librosInfo.append(libros[i].getTitulo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, librosInfo.toString());
    }

    public static void imprimirTodosLosUsuarios() {
        StringBuilder usuariosInfo = new StringBuilder("Lista de todos los usuarios:\n");
        for (int i = 0; i < totalUsuarios; i++) {
            usuariosInfo.append(usuarios[i].getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, usuariosInfo.toString());
    }
}

