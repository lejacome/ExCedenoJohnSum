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
	
	@Test
	public void cuandoUnSoloNumeroEsUsadoSeRetornaEseValor() {
		int[] a = {3};
		when(c.convertir("3")).thenReturn(a);
		
		Sumadora s = new Sumadora(c.convertir("3"));
		assertEquals(3, s.sumar());
	}

	@Test
	public void cuandoDosNumerosSonUsadosEntoncesRetornamosSuSuma() {
		int[] a = {3,6};
		when(c.convertir("3,6")).thenReturn(a);
		
		Sumadora s = new Sumadora(c.convertir("3,6"));
		assertEquals(9, s.sumar());
	}

}
