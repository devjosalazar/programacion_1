package porgramacion.arimetica;

import co.edu.uniquindio.programacion1.model.Aritmetica;
//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {

    private Aritmetica aritmetica;


    @BeforeEach
    public void init(){
        //aritmetica = new Aritmetica();
    }

    @Test
    public void sumaValorEsperadoTest(){
        float resultado = aritmetica.suma(2,2);
        float esperado = 4;
        assertEquals(esperado, resultado);
    }

    @Test
    public void sumaValorMayorTest(){
        float resultado = aritmetica.suma(2,2);
        float esperado = 5;
        assertTrue(esperado > resultado);
    }



}
