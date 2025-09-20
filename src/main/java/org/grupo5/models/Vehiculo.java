package org.grupo5.models;

//clase abstracta vehiculo implementa la interfaz Combustible
public abstract class Vehiculo implements Combustible{
    private final String marca;
    private final String modelo;
    private final int ltsCombustible;
    private int combustibleDisponible;

    public Vehiculo(String marca, String modelo, int ltsCombustible, int combustibleDisponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.ltsCombustible = ltsCombustible;
        this.combustibleDisponible = combustibleDisponible;
    }

    //getters
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getCombustibleDisponible(){ return this.combustibleDisponible;}

    public void incrementCombustibleDisponible(){
        this.combustibleDisponible += 10;
        if(this.combustibleDisponible > this.ltsCombustible){
            this.combustibleDisponible = this.ltsCombustible;
        }
    }

    public void decrementCombustibleDisponible(){
        if(this.combustibleDisponible -10 < 0){
            System.out.println("Recarga combustible para poder moverte");
        }else{
            this.combustibleDisponible = this.combustibleDisponible -10;
        }
    }

    //absract methods para las subclases
    public abstract void mover();
    public abstract void mostrarCombustible();
}

