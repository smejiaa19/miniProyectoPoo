package models;

public class Camion extends Vehiculo implements Combustible {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void Mover() {
        System.out.println("Moviendo el vehiculo con marca: " + getMarca() + " y modelo: " + getModelo());
        // Tenemos que acceder a los getters porque como son atributos privados
    }

    @Override
    public void Recargar() {
        System.out.println("Recargando combustible: " + getModelo());
    }
}
