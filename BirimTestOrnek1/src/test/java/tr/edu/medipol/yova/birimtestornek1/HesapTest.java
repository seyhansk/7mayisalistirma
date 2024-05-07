package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesapTest {

	@Test
	public void topla() {
		
		int sayi1 = 2;
		int sayi2 = 2;
		
		int sonuc = Hesap.topla(sayi1, sayi2);
		
		assertEquals(4, sonuc);
		
	}

	
	@Test
		public void cikar() {
	
		int sayi1 = 2;
		int sayi2 = 2;
	
		int sonuc = Hesap.cikar(sayi1, sayi2);
	
		assertEquals(0, sonuc);
	
	}
	
	@Test
	public void carp() {
		
		int sayi1 = 2;
		int sayi2 = 2;
		
		int sonuc = Hesap.carp(sayi1, sayi2);
		
		assertEquals(4, sonuc);
		
	}
	
	@Test
	public void bol() {
		
		int sayi1 = 2;
		int sayi2 = 2;
		
		int sonuc = Hesap.bol(sayi1, sayi2);
		
		assertEquals(1, sonuc);
		
	}
	

	}
  