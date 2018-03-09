package interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajValutu(String valuta, double kurs, GregorianCalendar datum);
	public void obrisiValutu(String valuta, double kurs, GregorianCalendar datum);
	public double vratiKurs(String valuta, double kurs, GregorianCalendar datum);
	
	
	
}
