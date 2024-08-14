package ejercicio5;

import javax.swing.*;

public class Habitacion {
    private int numeroHabitacion;
    private int precioXnoche;
    private Boolean disponibilidad;
    private String huespedesAlojados;

    public Habitacion(int numeroHabitacion, int precioXnoche, Boolean disponibilidad, String huespedesAlojados) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioXnoche = precioXnoche;
        this.disponibilidad = disponibilidad;
        this.huespedesAlojados = huespedesAlojados;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getPrecioXnoche() {
        return precioXnoche;
    }

    public void setPrecioXnoche(int precioXnoche) {
        this.precioXnoche = precioXnoche;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }
    public void mostrarDatos(){
        JOptionPane.showInternalMessageDialog(null,"numero de la habitacion: " + numeroHabitacion + '\n' + "Precio por noche: " + precioXnoche + '\n' + "Disponivilidad: " + (disponibilidad ? "Disponible" : "no disponible")  + '\n' + "Huespedes: " + huespedesAlojados);
    }
}
