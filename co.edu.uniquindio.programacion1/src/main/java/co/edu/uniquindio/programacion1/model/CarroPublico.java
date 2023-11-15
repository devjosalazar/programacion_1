package co.edu.uniquindio.programacion1.model;

import co.edu.uniquindio.programacion1.services.ICarroGas;

public class CarroPublico extends Carro implements ICarroGas {
    @Override
    public void encenderGas() {
        System.out.println("Encendiendo a gas Premium");
    }
}
