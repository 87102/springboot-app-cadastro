package com.PrimeiraAplicacaoApp.App.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_candidato")
public class Candidato implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	
	private String rg;
	
	private String nomeCandidato;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "vaga_codigo")
	private Vaga vaga;
	
	public Candidato() {
		
	}

	public Candidato(long id, String rg, String nomeCandidato, String email, Vaga vaga) {
		super();
		this.id = id;
		this.rg = rg;
		this.nomeCandidato = nomeCandidato;
		this.email = email;
		this.vaga = vaga;
	}


	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	
	
	
}
