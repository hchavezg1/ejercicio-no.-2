import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.contarPuertas();
        miVehiculo.contarPuertas();
        miVehiculo.contarPuertas();
        System.out.println(miVehiculo.puerta);



    }
}

class Vehiculo {
    public int puerta = 1;

    public void contarPuertas() {
        this.puerta++;
    }
}