package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {
    @Test
    public void testProstoCelsius() {

        assertEquals("Температура в Цельсиях", Main.prosto(1));
    }

    @Test
    public void testProstoFahrenheit() {

        assertEquals("Температура в Фаренгейтах", Main.prosto(2));
    }

    @Test
    public void testProstoInvalidInput() {

        assertNull(Main.prosto(3));
    }

    @Test
    public void testWord() {

        String result = Main.prosto(1);
        String resultTwo = Main.prosto(2);
        assertNotEquals(result, resultTwo);
    }

    @Test
    public void testWordTwo() {

        assertNotNull(Main.prosto(1));

    }
}