package ejercicio4;

public class MainPropiedad {
    public static void main(String[] args) {
        Propiedad propiedad1 = new Propiedad(001,"Cra 5 #12 - 74",35,70000,4,3,true,"Disponible");
        Propiedad propiedad2 = new Propiedad(002,"Cra 6 #24 - 72",50,1000,3,2,false,"Vendida");
        Propiedad propiedad3 = new Propiedad(003,"Cra 9 #32 - 83",60,20000,5,4,true,"En renta");

        Propiedad[] propiedades = {propiedad1,propiedad2,propiedad3};

        for(Propiedad propiedad : propiedades){
            propiedad.mostrarDatos();
        }

        propiedad1.setEstado("Vendida");
        System.out.println("Datos actualizados de la propiedad 1:");
        propiedad1.mostrarDatos();
    }
}
