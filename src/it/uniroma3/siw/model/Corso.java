package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "corsi")
public class Corso {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
	private String nome;
	private LocalDate dataInizio;
	private int durata;

	@ManyToOne
	private Docente docente;
	
	@ManyToMany(mappedBy="corsi")
	private List<Allievo> allievi;
	
	public Corso() {
	}
	
	public Corso(String nome, LocalDate dataInizio, int durata) {
		super();
		this.nome = nome;
		this.dataInizio = dataInizio;
		this.durata = durata;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}
}
