import co.edu.uniquindio.programacion1.model.Aritmetica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AritmeticaIBeforeTest {
    private Aritmetica aritmetica;

    @BeforeEach
    public void init(){
        aritmetica = new Aritmetica();
    }

    @AfterEach
    public void finish(){
        aritmetica = null;
    }

    /**
     * Creamos una instancia de la clase.
     * assertEquals(valorEsperado, valorReal, error)
     * compara el valor esperado con el real dentro de un error.
     * Ejecutamos el test
     */
    @Test
    public void testSuma(){
       assertEquals(2, aritmetica.suma(1,1));
    }

    @Test
    public void testResta() {
        assertEquals(3, aritmetica.resta(4, 1));
    }
    @Test
    public void testMultiplicacion() {
        assertEquals(6, aritmetica.multiplicacion(2, 3));
    }
    @Test
    public void testDivision() {
        assertEquals(5, aritmetica.division(10, 2));
    }
}
