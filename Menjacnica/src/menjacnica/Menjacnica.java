package menjacnica;

import java.util.GregorianCalendar;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajValutu(String valuta, String naziv, double kurs, GregorianCalendar datum) {

	}

	@Override
	public void obrisiValutu(String valuta, String naziv, GregorianCalendar datum) {

	}

	@Override
	public double vratiKurs(String valuta, String naziv, GregorianCalendar datum) {
		return 0;
	}

}
