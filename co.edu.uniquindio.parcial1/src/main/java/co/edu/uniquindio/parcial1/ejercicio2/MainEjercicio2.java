package co.edu.uniquindio.parcial1.ejercicio2;

import co.edu.uniquindio.parcial1.model.Automovil;
import co.edu.uniquindio.parcial1.model.Visitante;
import co.edu.uniquindio.parcial1.model.enumeracion.TipoMotor;

public class MainEjercicio2 {
    public static void main(String[] args) {
        inicializarDatosPrueba();
    }

    private static void inicializarDatosPrueba() {
        Automovil automovil1 = new Automovil(
                "Mustan GT",
                "",
                TipoMotor.ELECTRICO,
                "5 pasajeros",
                200.02,
                "aire");

        Automovil automovil2 = new Automovil(
                "Mustan GT",
                "",
                TipoMotor.GASOLINA,
                "5 pasajeros",
                200.02,
                "aire");


        if(automovil1.getTipoMotor() == TipoMotor.ELECTRICO){
            System.out.println();
        }

    }
}
