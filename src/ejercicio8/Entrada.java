package ejercicio8;

// Clase Entrada
class Entrada {
    private int numero;
    private String zona;
    private double valor;
    private boolean vendida;
    private boolean ingreso;

    public Entrada(int numero, String zona, double valor) {
        this.numero = numero;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingreso = false;
    }

    public void marcarComoVendida() {
        if (!vendida) {
            vendida = true;
            System.out.println("Entrada número " + numero + " vendida.");
        } else {
            System.out.println("Entrada número " + numero + " ya fue vendida.");
        }
    }

    public void marcarIngreso() {
        if (vendida && !ingreso) {
            ingreso = true;
            System.out.println("Ingreso permitido para entrada número " + numero + ".");
        } else if (!vendida) {
            System.out.println("No se puede permitir el ingreso, la entrada número " + numero + " no ha sido vendida.");
        } else {
            System.out.println("Ingreso ya registrado para la entrada número " + numero + ".");
        }
    }

    public boolean isVendida() {
        return vendida;
    }

    public String getZona() {
        return zona;
    }
}

// Clase Concierto
class Concierto {
    private int maxGeneral;
    private int maxVIP;
    private int entradasVendidasGeneral;
    private int entradasVendidasVIP;

    public Concierto(int maxGeneral, int maxVIP) {
        this.maxGeneral = maxGeneral;
        this.maxVIP = maxVIP;
        this.entradasVendidasGeneral = 0;
        this.entradasVendidasVIP = 0;
    }

    public void verificarDisponibilidad(String zona) {
        if (zona.equals("GENERAL")) {
            System.out.println("Entradas disponibles en GENERAL: " + (maxGeneral - entradasVendidasGeneral));
        } else if (zona.equals("VIP")) {
            System.out.println("Entradas disponibles en VIP: " + (maxVIP - entradasVendidasVIP));
        } else {
            System.out.println("Zona no válida.");
        }
    }

    public Entrada venderEntrada(String zona, double valor) {
        if (zona.equals("GENERAL")) {
            if (entradasVendidasGeneral < maxGeneral) {
                entradasVendidasGeneral++;
                return new Entrada(entradasVendidasGeneral, zona, valor);
            } else {
                System.out.println("No hay más entradas disponibles en la zona GENERAL.");
            }
        } else if (zona.equals("VIP")) {
            if (entradasVendidasVIP < maxVIP) {
                entradasVendidasVIP++;
                return new Entrada(entradasVendidasVIP, zona, valor);
            } else {
                System.out.println("No hay más entradas disponibles en la zona VIP.");
            }
        } else {
            System.out.println("Zona no válida.");
        }
        return null;
    }
}



