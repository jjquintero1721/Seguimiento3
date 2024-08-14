package ejercicio7;

import java.util.Date;

public class Prestamo {
    private String isbnLibro;
    private String idUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(String isbnLibro, String idUsuario, Date fechaPrestamo) {
        this.isbnLibro = isbnLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
    }

    public String getIsbnLibro() { return isbnLibro; }
    public void setIsbnLibro(String isbnLibro) { this.isbnLibro = isbnLibro; }

    public String getIdUsuario() { return idUsuario; }
    public void setIdUsuario(String idUsuario) { this.idUsuario = idUsuario; }

    public Date getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(Date fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }

    public Date getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(Date fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

    public void devolver() {
        this.fechaDevolucion = new Date();
    }

    public void imprimirDetalle() {
        System.out.println("ISBN del Libro: " + isbnLibro);
        System.out.println("ID del Usuario: " + idUsuario);
        System.out.println("Fecha de Préstamo: " + fechaPrestamo);
        System.out.println("Fecha de Devolución: " + (fechaDevolucion != null ? fechaDevolucion : "No devuelto aún"));
    }
}

