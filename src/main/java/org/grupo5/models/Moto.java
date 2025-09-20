package org.grupo5.models;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, int ltsCombustible, int combustibleDisponible) {
        super(marca, modelo,ltsCombustible, combustibleDisponible);
    }

    //metodos abstractos implementados
    @Override
    public void mover() {
        System.out.println("Arrancando la moto: " + getMarca() + " , modelo: " + getModelo());
        decrementCombustibleDisponible();
        mostrarCombustible();
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando combustible a la moto: " + getModelo());
        incrementCombustibleDisponible();
        mostrarCombustible();
    }

    @Override
    public void mostrarCombustible() {
        System.out.println("La moto tiene " + getCombustibleDisponible() + " litros de combustible disponibles");
    }
}
