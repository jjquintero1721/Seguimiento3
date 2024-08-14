package ejercicio6;
import javax.swing.*;
import java.util.Date;

public class Venta {
    private Date fecha;
    private Zapato zapato;
    private int talla;
    private int cantidad;
    private double valor;

    public Venta(Date fecha, Zapato zapato, int talla, int cantidad) {
        this.fecha = fecha;
        this.zapato = zapato;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valor = zapato.getPrecio() * cantidad;
    }

    public double calcularTotal() {
        return valor;
    }

    public void imprimirDetalle() {
        System.out.println("Fecha: " + fecha);
        zapato.imprimir();
        System.out.println("Talla: " + talla);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor: " + valor);
        System.out.println();
    }
}

