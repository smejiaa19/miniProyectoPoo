package models;

public class Moto extends Vehiculo implements Combustible{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void Mover() {
        System.out.println("Moviendo el vehiculo con marca: " + getMarca() + " Con modelo: " + getModelo());
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando combustible: " + getModelo());
    }
}
