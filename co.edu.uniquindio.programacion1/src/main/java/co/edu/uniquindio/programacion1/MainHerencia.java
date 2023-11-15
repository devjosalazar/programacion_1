package co.edu.uniquindio.programacion1;

import co.edu.uniquindio.programacion1.model.*;

import java.util.ArrayList;
import java.util.List;

public class MainHerencia {

    public static void main(String[] args) {
        ArrayList<Vehiculo> listaV = new ArrayList<>();

        //Carro vehiculo = new Vehiculo();
//        Vehiculo vehiculo = new Carro();
//        vehiculo.encender();
//        Avion avion = new Avion();
//        avion.encender();
        Carro carro = new Carro();
        carro.encender();
//        carro.encender("Empujando el carro");
//        carro.encender(2);


        CarroParticular carroParticular = new CarroParticular();
        carroParticular.encenderElectricamente();
        carroParticular.encenderGas();

        MiniCarro miniCarro = new MiniCarro();


//        listaV.add(vehiculo);
        listaV.add(carro);
//        listaV.add(avion);
        int contador = 0;

        for (Vehiculo veh: listaV) {
            if(veh instanceof  Carro){
                contador++;
            }
        }

        System.out.println("Cantidad carros: "+contador);

    }
}
