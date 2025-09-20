package org.grupo5;
import org.grupo5.models.*;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("Mercedes Benz", "T800", 450, 100);
        Carro carro = new Carro("Mclaren", "Senna", 70, 0);
        Moto moto = new Moto("BMW", "S1000RR", 20, 15);

        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = camion;
        vehiculos[1] = carro;
        vehiculos[2] = moto;

        for(Vehiculo vehiculo:vehiculos){
            System.out.println("Combustible disponible del vehiculo: " + vehiculo.getCombustibleDisponible() + "lts");
            System.out.println("Tratando de mover el vehiculo");
            vehiculo.mover();
            vehiculo.Recargar();
            System.out.println("---------------------------------------------------");
        }

    }
}