package co.edu.uniquindio.programacion1.model;

public class Cuenta {

    private String nombrePersona;
    private double saldo;

    public Cuenta(){

    }

    public Cuenta(String nombrePersona, double saldo) {
        this.nombrePersona = nombrePersona;
        this.saldo = saldo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
