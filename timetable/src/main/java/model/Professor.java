package model;

import javax.persistence.*;
@Entity
@Table(name="Professor")

public class Professor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="nome")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="grau")
	private int Degree;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public int getDegree() {
		return Degree;
	}

	public void setDegree(int degree) {
		Degree = degree;
	}

}
