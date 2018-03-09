package menjacnica;

public class Valuta {

	private String naziv;
	private String skracenica;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getSkracenica() {
		return skracenica;
	}
	
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta\n [Naziv = " + naziv + "\nSkracenica = " + skracenica + "\nProdajni kurs = " + prodajniKurs
				+ "\nSrednji kurs = " + srednjiKurs + "\nKupovni kurs = " + kupovniKurs + "]";
	}
	
	
	
}
