package ejercicio6;

public class Inventario {
    private Zapato zapato;
    private int[] tallas;
    private int[] cantidades;

    public Inventario(Zapato zapato, int[] tallas) {
        this.zapato = zapato;
        this.tallas = tallas;
        this.cantidades = new int[tallas.length];
    }

    public void registrarEntrada(int talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla) {
                cantidades[i] += cantidad;
                return;
            }
        }
        System.out.println("Talla " + talla + " no disponible en este modelo.");
    }

    public void registrarSalida(int talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla) {
                if (cantidades[i] >= cantidad) {
                    cantidades[i] -= cantidad;
                } else {
                    System.out.println("No hay suficiente stock para la talla " + talla);
                }
                return;
            }
        }
        System.out.println("Talla " + talla + " no disponible en este modelo.");
    }

    public Zapato getZapato() {
        return zapato;
    }

    public void mostrarInventario() {
        zapato.imprimir();
        for (int i = 0; i < tallas.length; i++) {
            System.out.println("Talla: " + tallas[i] + " - Cantidad: " + cantidades[i]);
        }
        System.out.println();
    }
}

