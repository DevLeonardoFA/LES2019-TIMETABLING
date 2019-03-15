package model;

import javax.persistence.*;
@Entity
@Table(name="Curso")

public class Curso {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="Nome do Curso")
	private String Nome_curso;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_curso() {
		return Nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		Nome_curso = nome_curso;
	}

	
}
