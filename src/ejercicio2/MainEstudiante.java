package ejercicio2;

public class MainEstudiante {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("","",0,0,0.0,"","");
        Est2 est2 = new Est2("","",0,0,0.0,"","",0);
        Est3 est3 = new Est3("","",0,0,0.0,"","",0,0);


        est1.setNombre("Martin");
        est2.setNombre("Jose");
        est3.setNombre("Manuel");

        est1.setApellido("Miguel");
        est2.setApellido("Jose");
        est3.setApellido("Manuel");

        est1.setGrado(11);
        est2.setGrado(10);
        est3.setGrado(9);

        est1.setEdad(16);
        est2.setEdad(15);
        est3.setEdad(15);

        est1.setPromedioAcademico(5.0);
        est2.setPromedioAcademico(3.0);
        est3.setPromedioAcademico(2.0);

        est1.setNombreMadre("maria");
        est2.setNombreMadre("sandra");
        est3.setNombreMadre("camila");

        est1.setNombrepadre("Juan");
        est2.setNombrepadre("Pedro");
        est3.setNombrepadre("Camilo");

        est2.setNumeroTelefono(311407815);
        est3.setNumeroTelefono(1263958617);

        est3.setNumeroTelefono2(123456789);

        est1.imprimirDatos1();
        System.out.println(" ");
        est2.imprimirDatos2();
        System.out.println(" ");
        est3.imprimirDatos3();
    }
}
