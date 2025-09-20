package org.grupo5.models;

public class Carro extends Vehiculo {
    public Carro(String marca, String modelo, int ltsCombustible, int combustibleDisponible) {
        super(marca, modelo, ltsCombustible, combustibleDisponible);
    }

    //metodos abstractos implementados
    @Override
    public void mover() {
        System.out.println("Arrancando carro marca: " + getMarca() + " , modelo: " + getModelo());
        decrementCombustibleDisponible();
        mostrarCombustible();
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando carro modelo: " + getModelo());
        incrementCombustibleDisponible();
        mostrarCombustible();
    }

    @Override
    public void mostrarCombustible() {
        System.out.println("El carro tiene " + getCombustibleDisponible() + " lts de combustible disponible");
    }
}
