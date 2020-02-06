package geometria;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCirculoPGB {

	@Test
	void testArea() {
		CirculoPGB c1= new Circulo(7);
		assertEquals(7,area(49 * PI),0);
	}

	@Test
	void testPerimetro() {
		CirculoPGB c1= new Circulo(7);
		assertEquals(7,perimetro(14 * PI),0);
	}

}
