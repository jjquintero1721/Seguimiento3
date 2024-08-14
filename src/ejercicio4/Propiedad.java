package ejercicio4;

import javax.swing.*;

public class Propiedad {
    private int idPropiedad;
    private String direccion;
    private int aream2;
    private int precio;
    private int cantidaHabitaciones;
    private int cantidadBaños;
    private Boolean garaje;
    private String estado;

    public Propiedad(int idPropiedad, String direccion, int aream2, int precio, int cantidaHabitaciones, int cantidadBaños, Boolean garaje, String estado) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.aream2 = aream2;
        this.precio = precio;
        this.cantidaHabitaciones = cantidaHabitaciones;
        this.cantidadBaños = cantidadBaños;
        this.garaje = garaje;
        this.estado = estado;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAream2() {
        return aream2;
    }

    public void setAream2(int aream2) {
        this.aream2 = aream2;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidaHabitaciones() {
        return cantidaHabitaciones;
    }

    public void setCantidaHabitaciones(int cantidaHabitaciones) {
        this.cantidaHabitaciones = cantidaHabitaciones;
    }

    public int getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(int cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public Boolean getGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatos(){
        JOptionPane.showInternalMessageDialog(null, "La identificacion de la propiedad es: " + idPropiedad + '\n' + "La direccion de la propiedad es: " + direccion + '\n' + "La propiedad cuenta con la siguiente area en m2: " + aream2 + '\n'
                + "La propiedad cuesta: " + precio + '\n' + "La propiedad cuenta con la siguiente cantidad de habitaciones: " + cantidaHabitaciones + '\n' + "La propiedad cuenta con la siguiente cantidad de baños: " +cantidadBaños + '\n' + "Disponivilidad del garaje: " + (garaje ? "si" : "no") + '\n' + "Disponivilidad de la propiedad: " +  estado );
    }
}
