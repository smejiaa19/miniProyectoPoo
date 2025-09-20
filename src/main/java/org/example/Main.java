package org.example;
import models.Camion;
import models.Carro;
import models.Moto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("Mercedes Benz", "T800");
        Carro carro = new Carro("Mclaren", "Senna");
        Moto moto = new Moto("BMW", "S1000RR");

        camion.Mover();
        camion.Recargar();
        carro.Mover();
        carro.Recargar();
        moto.Mover();
        moto.Recargar();
    }
}