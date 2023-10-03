package co.edu.uniquindio.programacion1;

import co.edu.uniquindio.programacion1.model.Cuenta;

public class mainBanco {
    public static void main(String[] args) {
        Cuenta cuenta = crearCuenta();
        retirarDinero(cuenta, 500);
        System.out.println("Salfo actual: "+ cuenta.getSaldo());
    }

    private static void retirarDinero(Cuenta cuenta, double valorRetiro) {
        double saldoActual = cuenta.getSaldo();
        double nuevoSaldo = saldoActual - valorRetiro;
        cuenta.setSaldo(nuevoSaldo);
    }

    private static Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNombrePersona("Pedro");
        cuenta.setSaldo(1000.0);
        return cuenta;
    }
}
