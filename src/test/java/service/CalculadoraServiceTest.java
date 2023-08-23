package service;

import br.com.ornitorrinco.service.CalculadoraService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unit")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;


    @BeforeAll
    public void init() {
        calculadoraService = new CalculadoraService();
    }


    @Test
    public void testSoma() {

        Double expected = 3.0;
        Double result = calculadoraService.sum(2.0, 1.0);


        assertEquals(expected, result);


    }


}
