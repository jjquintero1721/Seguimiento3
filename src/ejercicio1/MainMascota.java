package ejercicio1;

public class MainMascota {
    public static void main(String[] args) {

        Mascota mascota1 = new Mascota("", 0, "", "");
        Mascota mascota2 = new Mascota("", 0, "", "");
        Mascota mascota3 = new Mascota("", 0, "", "");

        mascota1.setNombre("Nicolas");
        mascota2.setNombre("Charly");
        mascota3.setNombre("Pepe");

        mascota1.setEdad(4);
        mascota2.setEdad(3);
        mascota3.setEdad(2);

        mascota1.setRaza("Bulldog");
        mascota2.setRaza("Chiguagua");
        mascota3.setRaza("Aleman");

        mascota1.setColor("Blanco");
        mascota2.setColor("Cafe");
        mascota3.setColor("Negro y cafe");

        mascota1.showPet();
        System.out.println(" ");
        mascota2.showPet();
        System.out.println(" ");
        mascota3.showPet();

    }
}
