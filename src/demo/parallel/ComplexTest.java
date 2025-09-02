package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void testAddition() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        Complex result = a.plus(b);

        assertEquals(3.0, result.getRe(), 0.001);
        assertEquals(3.0, result.getIm(), 0.001);
    }

    @Test
    public void testCube() {
        Complex a = new Complex(5, 5);
        Complex result = a.cube();

        assertEquals(-250.0, result.getRe(), 0.001);
        assertEquals(250.0, result.getIm(), 0.001);
    }


    @Test
    public void testMultiplication() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        Complex result = a.times(b);

        assertEquals(0.0, result.getRe(), 0.001);
        assertEquals(4.0, result.getIm(), 0.001);
    }

}
