package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodajValutu(String valuta, String naziv, double kurs, GregorianCalendar datum) {

	}

	@Override
	public void obrisiValutu(String valuta, String naziv, GregorianCalendar datum) {

	}

	@Override
	public Kurs vratiKurs(String valuta, String vrsta, GregorianCalendar datum) {
		Valuta val = new Valuta();
		val.setNaziv(valuta);
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setVrsta(vrsta);
		int obj=0;
		
		if(!valute.contains(val)) obj = valute.indexOf(val); else
		throw new RuntimeException("Data valuta ne postoji u bazi");
		
		if(valute.get(obj).getKursevi().contains(k)) return k;
		else throw new RuntimeException("Ne postoji kurs za taj dan");
	}

}
