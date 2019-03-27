package model;

import javax.persistence.*;
@Entity
@Table(name="Materia")

public class Materia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="nome")
	private String name;
	
	@Column(name="profissional")
	private String professional;
	
	@Column(name="periodo")
	private String period;

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
		this.name = name;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
	
}
