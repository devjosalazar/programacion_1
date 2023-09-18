package co.edu.uniquindio.programacion1;

import co.edu.uniquindio.programacion1.model.EjemploVariablesEstaticas;
import co.edu.uniquindio.programacion1.model.Figura;
import co.edu.uniquindio.programacion1.model.enumeracion.TipoFigura;

public class Main {
    public static void main(String[] args) {
        ejemploFigura();
        ejemploContador();

    }

    private static void ejemploContador() {
        EjemploVariablesEstaticas objeto1 = new EjemploVariablesEstaticas();
        EjemploVariablesEstaticas objeto2 = new EjemploVariablesEstaticas();
        EjemploVariablesEstaticas objeto3 = new EjemploVariablesEstaticas();

        // Acceder a la variable estática desde las instancias
        System.out.println("Valor de contador desde objeto1: " + objeto1.contador);
        System.out.println("Valor de contador desde objeto2: " + objeto2.contador);
        System.out.println("Valor de contador desde objeto3: " + objeto3.contador);

        // Acceder a la variable estática directamente desde la clase
        System.out.println("Valor de contador desde la clase: " + EjemploVariablesEstaticas.contador);

    }

    private static void ejemploFigura() {
        Figura figura1 = new Figura();
        figura1.setAlto(10);
        figura1.setAncho(10);
        figura1.setLargo(50);

        Figura figura2 = new Figura();
        figura2.setAlto(15);
        figura2.setAncho(15);
        figura2.setLargo(50);


        System.out.println(figura1.toString());
        System.out.println(figura2.toString());
        System.out.println(Figura.color);
        System.out.println(Figura.RADIO);
    }
}