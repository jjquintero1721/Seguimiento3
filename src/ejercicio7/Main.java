package ejercicio7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {
                    "Registrar libro",
                    "Registrar usuario",
                    "Prestar libro",
                    "Devolver libro",
                    "Consultar préstamos por usuario",
                    "Ver todos los libros",
                    "Ver todos los usuarios",
                    "Salir"
            };

            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Biblioteca",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion != null) {
                switch (seleccion) {
                    case "Registrar libro":
                        Libro.registrarLibro();
                        break;
                    case "Registrar usuario":
                        Libro.registrarUsuario();
                        break;
                    case "Prestar libro":
                        Libro.prestarLibro();
                        break;
                    case "Devolver libro":
                        Libro.devolverLibro();
                        break;
                    case "Consultar préstamos por usuario":
                        Libro.consultarPrestamosPorUsuario();
                        break;
                    case "Ver todos los libros":
                        Libro.imprimirTodosLosLibros();
                        break;
                    case "Ver todos los usuarios":
                        Libro.imprimirTodosLosUsuarios();
                        break;
                    case "Salir":
                        continuar = false;
                        break;
                }
            } else {
                continuar = false;
            }
        }
    }
}
