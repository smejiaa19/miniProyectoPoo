package models;

public class Carro extends Vehiculo implements Combustible{
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void Mover() {
        System.out.println("Moviendo carro con marca: " + getMarca() + " Con modelo: " + getModelo());
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando carro con modelo: " + getModelo());
    }
}
