package ejercicio3;

import jdk.jshell.EvalException;

import javax.swing.*;

public class CuentaBancaria {
    private int numeroCuenta;
    private int saldo;
    private Boolean estado;
    private int claveSeguridad;

    public CuentaBancaria(int numeroCuenta, int saldo, Boolean estado, int claveSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.claveSeguridad = claveSeguridad;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }
    public void ingresarCuenta(){
        if (numeroCuenta == 123456789){
           Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave de seguridad: "));
            if (claveSeguridad == 1234){
                this.estado = true;
                obcionesCuenta();
            } else if (claveSeguridad != 1234) {
                this.estado = false;
            }
        } else if (numeroCuenta != 123456789) {
            JOptionPane.showInternalMessageDialog(null,"numero de cuenta erroneo: ");
            this.estado = false;
        }

    }
    public void obcionesCuenta(){
        if (estado == true){
            int acceso = Integer.parseInt(JOptionPane.showInputDialog(null ,"Seleccione el servicio al que quiere acceder:" + '\n' +  "1 = Consultar Saldo" + '\n' + "2 = Retirar Efectivo" + '\n' + "3 = Consignar Efectivo" +'\n' + "4 = Cambiar clave" +'\n' + "5 = salir"));
            if (acceso == 1){
                consultarSaldo();
            }else if (acceso == 2){
                retirarEfectivo();
            }else if (acceso == 3){
                consignarEfectivo();
            }else if (acceso == 4){
                cambiarClave();
            }else if (acceso == 5){
                this.estado = false;
            }
        }
    }

    public void consultarSaldo() {
        JOptionPane.showInternalMessageDialog(null,"su saldo: " + saldo);
        obcionesCuenta();
    }
    public void retirarEfectivo() {
        int retiro = Integer.parseInt(JOptionPane.showInputDialog(null , "ingrese la cantidad de dinero que desea retirar: "));
        if (retiro > 1 && retiro < saldo) {
            int valorRetiro = saldo - retiro;
            JOptionPane.showInternalMessageDialog(null, "usted acaba de retirar: " + retiro + " en su cuenta quedan: " + valorRetiro );
            saldo = valorRetiro;
            obcionesCuenta();
        } else if (retiro < 1 && retiro > saldo) {
            JOptionPane.showInternalMessageDialog(null,"El valor de retiro seleccionado es invalido vuelva a intentarlo");
            obcionesCuenta();
        }
    }
    public void consignarEfectivo() {
        int consignacion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el dinero a consignar: "));
        if (consignacion > 1 ) {
            int valorConsignacion = consignacion + saldo;
            JOptionPane.showInternalMessageDialog(null,"usted acaba de consignar: " + valorConsignacion);
            saldo = valorConsignacion;
            obcionesCuenta();
        } else if (consignacion < 1 ) {
            JOptionPane.showInternalMessageDialog(null ,"el valor ingresado a consignar no es valido intentelo de nuevo: " );
            obcionesCuenta();
        }
    }
    public void cambiarClave(){
        int claveIngresada = Integer.parseInt(JOptionPane.showInputDialog(null,"primero ingrese su clave vieja; "));
        if (claveIngresada == claveSeguridad){
            int cambioClave = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la clave nueva: "));
            if (claveSeguridad == cambioClave){
                JOptionPane.showInternalMessageDialog(null ,"la clave de seguridad es igual ingrese una nueva clave valida: ");
                cambiarClave();
            } else if (claveSeguridad != cambioClave) {
                JOptionPane.showInternalMessageDialog(null, "la clave de seguridad se a cambiado con exito: ");
                claveSeguridad = cambioClave;
                obcionesCuenta();
            }
        } else if (claveSeguridad != claveIngresada) {
            JOptionPane.showInternalMessageDialog(null ,"la clave de seguridad no es valido: ");
            cambiarClave();
        }

    }
}
