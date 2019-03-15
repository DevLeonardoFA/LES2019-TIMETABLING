package model;

import javax.persistence.*;
@Entity
@Table(name="Professor")

public class Professor {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="nome")
	private String Nome;
	
	@Column(name="email")
	private String Email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
	
}
