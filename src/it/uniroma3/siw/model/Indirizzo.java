package it.uniroma3.siw.model;

public class Indirizzo {

	private String via;
	private int numeroCivico;
	private String comune;
	private int CAP;
	private String provincia;

	public Indirizzo(String via, int numeroCivico, String comune, int cAP, String provincia) {
		super();
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.comune = comune;
		CAP = cAP;
		this.provincia = provincia;
	}
	
	public String getVia() {
		return via;
	}
	
	public void setVia(String via) {
		this.via = via;
	}
	
	public int getNumeroCivico() {
		return numeroCivico;
	}
	
	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	
	public String getComune() {
		return comune;
	}
	
	public void setComune(String comune) {
		this.comune = comune;
	}
	
	public int getCAP() {
		return CAP;
	}
	
	public void setCAP(int cAP) {
		CAP = cAP;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
