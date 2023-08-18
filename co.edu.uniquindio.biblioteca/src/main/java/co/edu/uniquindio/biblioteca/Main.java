package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;


public class Main {
    public static void main(String[] args) {
        
        crearVariables();
        crearLibros();


    }

    private static void crearLibros() {
        //crear los 5 libros
        Libro libro1 = new Libro();
        libro1.setNombre("suma");
        libro1.setEditorial("norma");

        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();
        //Obtener la cantidad de libros donde el título empiece por una vocal y consonante.
        calcularVocalesYConsonantes(libro1, libro2, libro3,libro4,libro5);



    }

    public static void calcularVocalesYConsonantes(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        int cantidadTerror = 0;
        int cantidadConsonantes = 0;

        if(libro1.getGenero().equals("Terror")){
            cantidadTerror = cantidadTerror + 1;
        }




    }



    public static void crearVariables(){
        int edad = 25;
        double precio = 2000.5;
        boolean estado = true;
        String concatenado = "Mi edad es: "+ edad+ " y gano \n: "+precio+ " y estoy"+estado;
        System.out.println(concatenado);
    }
    
    
}




