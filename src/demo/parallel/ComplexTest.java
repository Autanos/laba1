package demo.parallel;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    public void testPlus() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);

        a.plus(b);

        assertEquals(4.0, a.getRe());
        assertEquals(6.0, a.getIm());
    }
    @org.junit.jupiter.api.Test
    public void testMinus() {
        Complex a = new Complex(5.0, 7.0);
        Complex b = new Complex(2.0, 3.0);

        a.minus(b);

        assertEquals(3.0, a.getRe());
        assertEquals(4.0, a.getIm());
    }
}