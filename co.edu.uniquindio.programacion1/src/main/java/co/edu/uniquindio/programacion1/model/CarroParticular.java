package co.edu.uniquindio.programacion1.model;

import co.edu.uniquindio.programacion1.services.ICarroElectrico;
import co.edu.uniquindio.programacion1.services.ICarroGas;

public class CarroParticular extends Carro implements ICarroElectrico, ICarroGas {
    @Override
    public void encenderElectricamente() {
        System.out.println("Encendiendo electrico");
    }

    @Override
    public void encenderGas() {
        System.out.println("Encendiendo a gas barato");
    }
}
