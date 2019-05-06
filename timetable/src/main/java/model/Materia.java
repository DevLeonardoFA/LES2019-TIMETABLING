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

	@Column(name="curso")
	private String matter;
	
	@Column(name="semestre")
	private String semester;
	
	@Column(name="periodo")
	private String period;
	
	@Column(name="carga horaria")
	private String workload;
	
	@Column(name="sigla")
	private String initials;
	
	@Column(name="profissional")
	private String professional;

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

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getWorkload() {
		return workload;
	}

	public void setWorkload(String workload) {
		this.workload = workload;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}
	
	
}
