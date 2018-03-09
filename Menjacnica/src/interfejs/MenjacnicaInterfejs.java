package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajValutu(String valuta, String naziv, double kurs, GregorianCalendar datum);
	public void obrisiValutu(String valuta, String naziv, GregorianCalendar datum);
	public Kurs vratiKurs(String valuta, String naziv, GregorianCalendar datum);
	
	
	
}
