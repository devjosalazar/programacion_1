package co.edu.uniquindio.programacion1.model;

public  abstract class Vehiculo{

    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo() {
    }

    public void encender(){
        System.out.println("Encendiendo mi vehiculo");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
