package ejercicio2;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int grado;
    private int edad;
    private double promedioAcademico;
    private String nombreMadre;
    private String nombrepadre;

    public Estudiante(String nombre,String apellido,int grado,int edad, double promedioAcademico, String nombreMadre, String nombrepadre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreMadre = nombreMadre;
        this.nombrepadre = nombrepadre;
        imprimirDatos1();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getNombrepadre() {
        return nombrepadre;
    }

    public void setNombrepadre(String nombrepadre) {
        this.nombrepadre = nombrepadre;
    }

    public void imprimirDatos1(){
        System.out.println(nombre + '\n' + apellido + '\n' + grado + '\n' + edad + '\n' + promedioAcademico + '\n' + nombreMadre + '\n' + nombrepadre);
    }

}
class Est2 extends Estudiante{
    private int numeroTelefono;
    public Est2(String nombre, String apellido, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrepadre, int numeroTelefono) {
        super(nombre, apellido, grado, edad, promedioAcademico, nombreMadre, nombrepadre);
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void imprimirDatos2(){
        System.out.println(getNombre() + '\n' + getApellido() + '\n' + getGrado() + '\n' + getEdad() + '\n' + getPromedioAcademico() + '\n' + getNombreMadre() + '\n' + getNombrepadre() + '\n' + getNumeroTelefono());
    }

}
class Est3 extends Estudiante{
    private int numeroTelefono;
    private int numeroTelefono2;

    public Est3(String nombre, String apellido, int grado, int edad, double promedioAcademico, String nombreMadre, String nombrepadre,int numeroTelefono,int numeroTelefono2) {
        super(nombre, apellido, grado, edad, promedioAcademico, nombreMadre, nombrepadre);
        this.numeroTelefono = numeroTelefono;
        this.numeroTelefono2 = numeroTelefono2;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroTelefono2() {
        return numeroTelefono2;
    }

    public void setNumeroTelefono2(int numeroTelefono2) {
        this.numeroTelefono2 = numeroTelefono2;
    }
    public void imprimirDatos3(){
        System.out.println(getNombre() + '\n' + getApellido() + '\n' + getGrado() + '\n' + getEdad() + '\n' + getPromedioAcademico() + '\n' + getNombreMadre() + '\n' + getNombrepadre() + '\n' + getNumeroTelefono() + '\n' + getNumeroTelefono2());
    }
}
