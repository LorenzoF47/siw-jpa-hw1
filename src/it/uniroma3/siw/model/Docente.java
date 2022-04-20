package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
	private String nome;
    @Column(nullable = false)
    private String cognome;
	private LocalDate dataNascita;
	private String luogoNascita;
	private int pIVA;

	@OneToMany(mappedBy="docente")
	private List<Corso> corsi;
	
	public Docente() {
	}
	
	public Docente(String nome, String cognome, LocalDate dataNascita, String luogoNascita, int pIVA) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.pIVA = pIVA;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public String getLuogoNascita() {
		return luogoNascita;
	}
	
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	
	public int getpIVA() {
		return pIVA;
	}
	
	public void setpIVA(int pIVA) {
		this.pIVA = pIVA;
	}
}
