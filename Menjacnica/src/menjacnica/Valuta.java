package menjacnica;

import java.util.LinkedList;

public class Valuta {

	private String naziv;
	private String skracenica;
	private LinkedList<Kurs> kursevi;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		if(naziv==null) throw new RuntimeException("Vrednost naziva je null vrednost");
		this.naziv = naziv;
	}
	
	public String getSkracenica() {
		return skracenica;
	}
	
	public void setSkracenica(String skracenica) {
		if(skracenica==null) throw new RuntimeException("Vrednost skracenice je null vrednost");
		this.skracenica = skracenica;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		if(kursevi==null) throw new RuntimeException("Vrednost liste je null");
		this.kursevi = kursevi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenica=" + skracenica + "]";
	}
	
	

	
	
	

	
	
	
	
}
