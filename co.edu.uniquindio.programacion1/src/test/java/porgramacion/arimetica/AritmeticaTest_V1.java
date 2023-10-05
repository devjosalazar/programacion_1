package porgramacion.arimetica;

import co.edu.uniquindio.programacion1.model.Aritmetica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AritmeticaTest_V1 {


    @Test
    public void sumaValorEsperadoTest(){
        Aritmetica aritmetica = new Aritmetica();
        float resultado = aritmetica.suma(2,2);
        float esperado = 4;
        assertEquals(esperado, resultado);
    }

    @Test
    public void sumaValorMayorTest(){
        Aritmetica aritmetica = new Aritmetica();
        float resultado = aritmetica.suma(2,2);
        float esperado = 5;
        assertTrue(esperado > resultado);
    }



}
