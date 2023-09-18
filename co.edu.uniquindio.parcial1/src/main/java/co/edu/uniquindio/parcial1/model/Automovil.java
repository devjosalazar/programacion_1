package co.edu.uniquindio.parcial1.model;

import co.edu.uniquindio.parcial1.model.enumeracion.TipoMotor;

public class Automovil {

    private String nombreModelo;
    private String tipoCarroceria;
    private TipoMotor tipoMotor;
    private String capacidadPasajeros;
    private double precioBase;
    private String opcionesAdicionales;


    public Automovil() {
    }


    public Automovil(String nombreModelo, String tipoCarroceria, TipoMotor tipoMotor, String capacidadPasajeros, double precioBase, String opcionesAdicionales) {
        this.nombreModelo = nombreModelo;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoMotor = tipoMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioBase = precioBase;
        this.opcionesAdicionales = opcionesAdicionales;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(String capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getOpcionesAdicionales() {
        return opcionesAdicionales;
    }

    public void setOpcionesAdicionales(String opcionesAdicionales) {
        this.opcionesAdicionales = opcionesAdicionales;
    }
}
