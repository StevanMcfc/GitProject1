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
	
	
	
}
