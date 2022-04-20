package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Società {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String ragioneSociale;
	private Indirizzo indirizzoSede;
	private int telefono;
	
	@OneToOne (cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) //quando faccio la persist o la remove di Società il cascade va a propagare l'operazione anche al suo indirizzo 
	private Indirizzo indirizzo;

	public Società() {
	}
	
	public Società(String ragioneSociale, Indirizzo indirizzoSede, int telefono) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.indirizzoSede = indirizzoSede;
		this.telefono = telefono;
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
	public Indirizzo getIndirizzoSede() {
		return indirizzoSede;
	}
	
	public void setIndirizzoSede(Indirizzo indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
