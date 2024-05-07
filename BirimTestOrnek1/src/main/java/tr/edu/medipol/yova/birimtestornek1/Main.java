package tr.edu.medipol.yova.birimtestornek1;
import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {

		
		String ornekMetin = "                 yazilim ortam ve araclari";
		String sonuc = Main.metniFormatla(ornekMetin);
		System.out.println("'" + ornekMetin + "' formatlandi: -->'" + sonuc + "'");
	}
	
	public static String metniFormatla(String kaynakMetin) {
		String formatliMetin;
		formatliMetin = StringUtils.normalizeSpace(kaynakMetin);
		formatliMetin = StringUtils.capitalize(formatliMetin);
		formatliMetin = StringUtils.abbreviate(formatliMetin, 25);
		return formatliMetin;
	}

}
