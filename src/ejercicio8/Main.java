package ejercicio8;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Concierto
        Concierto concierto = new Concierto(5, 2);

        // Verificar disponibilidad en ambas zonas
        concierto.verificarDisponibilidad("GENERAL");
        concierto.verificarDisponibilidad("VIP");

        // Vender entradas
        Entrada entrada1 = concierto.venderEntrada("GENERAL", 50.0);
        Entrada entrada2 = concierto.venderEntrada("VIP", 100.0);
        Entrada entrada3 = concierto.venderEntrada("VIP", 100.0);
        Entrada entrada4 = concierto.venderEntrada("VIP", 100.0);  // Intento de vender más entradas de las disponibles

        // Marcar como vendidas
        if (entrada1 != null) entrada1.marcarComoVendida();
        if (entrada2 != null) entrada2.marcarComoVendida();
        if (entrada3 != null) entrada3.marcarComoVendida();

        // Simular el ingreso
        if (entrada1 != null) entrada1.marcarIngreso();
        if (entrada2 != null) entrada2.marcarIngreso();
        if (entrada3 != null) entrada3.marcarIngreso();
        if (entrada1 != null) entrada1.marcarIngreso();  // Intento de ingresar con la misma entrada
    }
}
