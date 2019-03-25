package model;

import javax.persistence.*;
@Entity
@Table(name="Professor")

public class Professor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="nome")
	private String Name;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="grau")
	private int Grau;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getGrau() {
		return Grau;
	}

	public void setGrau(int grau) {
		Grau = grau;
	}
	
}
