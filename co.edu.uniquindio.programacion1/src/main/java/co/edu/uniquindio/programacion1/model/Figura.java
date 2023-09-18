package co.edu.uniquindio.programacion1.model;

import co.edu.uniquindio.programacion1.model.enumeracion.TipoFigura;

public class Figura {
    private int ancho;
    private int largo;
    private int alto;
    public static String color = "Rojo";
    public static final double RADIO = 20.5;

    private TipoFigura tipoFigura;

    public Figura() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Figura.color = color;
    }

    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(TipoFigura tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                '}';
    }
}
