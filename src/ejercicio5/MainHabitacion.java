package ejercicio5;

import javax.swing.*;

public class MainHabitacion {
    public static void main(String[] args) {
        Habitacion hb1 = new Habitacion(101,2000,true,"0");
        Habitacion hb2 = new Habitacion(102,3000,true,"0");
        Habitacion hb3 = new Habitacion(103,4000,false,"4");
        Habitacion hb4 = new Habitacion(104,3000,false,"6");
        Habitacion hb5 = new Habitacion(105,3000,false,"7");

        Habitacion[] habitaciones = {hb1,hb2,hb3,hb4,hb5};

        hb1.mostrarDatos();
        hb2.mostrarDatos();
        hb3.mostrarDatos();
        hb4.mostrarDatos();
        hb5.mostrarDatos();

        hb1.setDisponibilidad(false);
        hb1.setHuespedesAlojados("2");

        JOptionPane.showInternalMessageDialog(null,"La habitacion 1 se a actualizado:");
        hb1.mostrarDatos();
    }
}
