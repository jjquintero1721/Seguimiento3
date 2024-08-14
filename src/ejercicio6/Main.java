package ejercicio6;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Zapato zapato1 = new Zapato("Zapato1", "Cuero", "Negro", 100.0, "Primavera");
        Zapato zapato2 = new Zapato("Zapato2", "Suede", "Marrón", 120.0, "Otoño");
        Zapato zapato3 = new Zapato("Zapato3", "Sintético", "Gris", 80.0, "Invierno");
        Zapato zapato4 = new Zapato("Zapato4", "Cuero", "Negro", 130.0, "Primavera");
        Zapato zapato5 = new Zapato("Zapato5", "Cuero", "Café", 110.0, "Verano");


        int[] tallas = { 40, 41 };

        Inventario inventario1 = new Inventario(zapato1, tallas);
        Inventario inventario2 = new Inventario(zapato2, tallas);
        Inventario inventario3 = new Inventario(zapato3, tallas);
        Inventario inventario4 = new Inventario(zapato4, tallas);
        Inventario inventario5 = new Inventario(zapato5, tallas);

        inventario1.registrarEntrada(40, 10);
        inventario1.registrarEntrada(41, 10);
        inventario2.registrarEntrada(40, 10);
        inventario2.registrarEntrada(41, 10);
        inventario3.registrarEntrada(40, 10);
        inventario3.registrarEntrada(41, 10);
        inventario4.registrarEntrada(40, 10);
        inventario4.registrarEntrada(41, 10);
        inventario5.registrarEntrada(40, 10);
        inventario5.registrarEntrada(41, 10);

        Venta venta1 = new Venta(new Date(), zapato1, 40, 2);
        Venta venta2 = new Venta(new Date(), zapato3, 41, 1);
        Venta venta3 = new Venta(new Date(), zapato2, 40, 3);

        inventario1.registrarSalida(40, 2);
        inventario3.registrarSalida(41, 1);
        inventario2.registrarSalida(40, 3);

        System.out.println("Inventario actual:");
        inventario1.mostrarInventario();
        inventario2.mostrarInventario();
        inventario3.mostrarInventario();
        inventario4.mostrarInventario();
        inventario5.mostrarInventario();

        System.out.println("Detalle de ventas:");
        venta1.imprimirDetalle();
        venta2.imprimirDetalle();
        venta3.imprimirDetalle();
    }
}

