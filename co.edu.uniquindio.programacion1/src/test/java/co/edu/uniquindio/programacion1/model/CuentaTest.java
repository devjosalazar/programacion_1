package co.edu.uniquindio.programacion1.model;

import co.edu.uniquindio.programacion1.dto.CuentaDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    CuentaDto cuentaDto;

    @BeforeEach
    void init(){
        cuentaDto = new CuentaDto("Carlos", 5000.0);
    }



    @Test
    void testNombrePersonaRecord(){
        //CuentaDto cuentaDto = new CuentaDto("Carlos", 5000.0);
        String esperado = "Carlos";
        String real = cuentaDto.nombrePersona();
        //assertEquals(esperado, real);
        //assertTrue(real.length() < 1);
        assertFalse(real.length() < 1);
    }

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNombrePersona("oscar");
        String esperado = "oscar";
        String real = cuenta.getNombrePersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("oscar"));
        assertNotEquals(esperado, real);
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Pedro", 200000.0);
        assertEquals(20000.0, cuenta.getSaldo());
//        assertFalse(cuenta.getSaldo() <= 0);
//        assertTrue(cuenta.getSaldo() >= 0);
    }

    @Test
    void testReferenciaCuenta(){
        Cuenta cuenta = new Cuenta("oscar", 20000.0);
        Cuenta cuenta2 = new Cuenta("Oscar", 20000.0);
//        assertNotEquals(cuenta2, cuenta);
        assertEquals(cuenta2, cuenta);
    }
}