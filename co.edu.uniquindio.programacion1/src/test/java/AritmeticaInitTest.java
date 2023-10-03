import co.edu.uniquindio.programacion1.model.Aritmetica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AritmeticaInitTest {


    /**
     * La etiqueta @Test marca un método como método de prueba.
     * Los métodos de prueba siempre deben ser public void.
     */
    @Test
    public void testSumaFail(){
        fail("No implementado");
    }

    /**
     * Creamos una instancia de la clase.
     * assertEquals(valorEsperado, valorReal, error)
     * compara el valor esperado con el real dentro de un error.
     * Ejecutamos el test
     */
    @Test
    public void testSuma(){
        Aritmetica aritmetica = new Aritmetica();
       assertEquals(2, aritmetica.suma(1,1));
    }

    @Test
    public void testResta() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(3, aritmetica.resta(4, 1));
    }
    @Test
    public void testMultiplicacion() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(6, aritmetica.multiplicacion(2, 3));
    }
    @Test
    public void testDivision() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(5, aritmetica.division(10, 2));
    }
}
