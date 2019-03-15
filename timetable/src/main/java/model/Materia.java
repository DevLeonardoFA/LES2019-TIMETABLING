package model;

import javax.persistence.*;
@Entity
@Table(name="Materia")

public class Materia {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="Nome da materia")
	private String nome_materia;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_materia() {
		return nome_materia;
	}

	public void setNome_materia(String nome_materia) {
		this.nome_materia = nome_materia;
	}
	
	
	/*
	
	private long Curso;
	private long Professor;
	
	*/
}
