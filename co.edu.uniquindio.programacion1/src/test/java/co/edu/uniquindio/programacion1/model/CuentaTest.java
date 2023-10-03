package co.edu.uniquindio.programacion1.model;

import co.edu.uniquindio.programacion1.dto.CuentaDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuentaRecord(){
        CuentaDto cuentaDto = new CuentaDto("Carlos", 5000.0);
        String esperado = "Carlos";
        String real = cuentaDto.nombrePersona();
        assertEquals(esperado, real);
    }

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNombrePersona("oscar");
        String esperado = "oscar";
        String real = cuenta.getNombrePersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("oscar"));
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Pedro", 200000.0);
    }

}