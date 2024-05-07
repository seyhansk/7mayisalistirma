package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void testMetniFormatla1() {

		String kaynakMetin = "                    ders 1     ";

		String sonuc = Main.metniFormatla(kaynakMetin);

		// KONTROLLER

		assertNotNull(sonuc);
		assertEquals("Ders 1", sonuc);
	}

}
