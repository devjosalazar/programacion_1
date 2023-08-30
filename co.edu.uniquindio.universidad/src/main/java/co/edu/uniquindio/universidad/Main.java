package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.Docente;
import co.edu.uniquindio.universidad.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan",20,"12121@",1,2.0,3.0,5.0);
        Estudiante estudiante2 = crearEstudiantePorConstructor("Pedro",30,"12121@",3,3.0,4.0,5.0);
        Estudiante estudiante3 = crearEstudiante("Ana",19,"12121@",4,50,3.0,2.0);


        Docente docente = new Docente("Carlos", 30, "sdsd@");

    }


    private static Estudiante crearEstudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);

        return estudiante;
    }

    private static Estudiante crearEstudiantePorConstructor(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);
        return estudiante;
    }
}