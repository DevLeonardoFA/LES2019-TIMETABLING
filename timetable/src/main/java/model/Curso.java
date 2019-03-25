package model;

import javax.persistence.*;
@Entity
@Table(name="Curso")

public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Nome_do_Curso")
	private String Nome_curso;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_curso() {
		return Nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		Nome_curso = nome_curso;
	}

	
}
