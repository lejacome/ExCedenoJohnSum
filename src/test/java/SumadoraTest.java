import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SumadoraTest {
	
	Convertidor c = mock(Convertidor.class);
	
	@Test
	public void test() {
		int[] a = {2,3};
		when(c.convertir("2,3")).thenReturn(a);
		
		Sumadora s = new Sumadora(c.convertir("2,3"));
		assertEquals(5, s.sumar());
		
	}

}
