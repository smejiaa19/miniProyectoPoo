package org.grupo5.models;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int ltsCombustible, int combustibleDisponible) {
        super(marca, modelo, ltsCombustible, combustibleDisponible);
    }

    //metodos abstractos implementados
    @Override
    public void mover() {
        System.out.println("Arrancando el camion marca: " + getMarca() + " y modelo: " + getModelo());
        decrementCombustibleDisponible();
        mostrarCombustible();
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando combustible al camion " + getModelo());
        incrementCombustibleDisponible();
        mostrarCombustible();
    }

    @Override
    public void mostrarCombustible() {
        System.out.println("El camion tiene " + getCombustibleDisponible() + " lts de combustible disponible");
    }
}
