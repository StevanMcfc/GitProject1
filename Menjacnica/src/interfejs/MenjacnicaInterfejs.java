package interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajValutu(String valuta, String naziv, double kurs, GregorianCalendar datum);
	public void obrisiValutu(String valuta, String naziv, GregorianCalendar datum);
	public double vratiKurs(String valuta, String naziv, GregorianCalendar datum);
	
	
	
}
