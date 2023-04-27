package hossam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldBeEven(){
        assertTrue(Calculator.isEven(2));

    }
    @Test
    void correctSurface(){
        assertEquals(28.274333882308138,Calculator.surfaceCircle(3));
    }
    //OEFENING 1:
    @Test
    void testpower ()
    { assertEquals(16, Calculator.power(4,2));}

    //OEFENING 2:

    @Test
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                Calculator.divide(1, 0));
        assertEquals("/ by 0", exception.getMessage());
    }

    //OEFENING 3:

    @Test
    void testfactorial (){
        assertEquals(120,Calculator.factorial(5));
    }

    //CHALLENGES:

 /*   @ParameterizedTest
    @CsvSource({120, 5,
    720, 6,
    24, 4})
    void testWithCsvSource(int expected, int waarde) {
        assertEquals(0, waarde);}
} */
