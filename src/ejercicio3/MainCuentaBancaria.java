package ejercicio3;

import javax.swing.*;

public class MainCuentaBancaria {
    public static void main(String[] args) {
    CuentaBancaria cb = new CuentaBancaria(1,1,true,1234);
    cb.setSaldo(5000);
    cb.setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cuenta: ")));
    cb.ingresarCuenta();
    }
}
