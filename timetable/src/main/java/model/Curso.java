package model;

import javax.persistence.*;

import Tabelas.TabelaCurso;
@Entity
@Table(name="Curso")

public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Nome_do_Curso")
	private String name;

	@Column(name="Quantidade_de_Semestres")
	private String qtdhalf;
	
	@Column(name="Carga_Horaria")
	private String workload;
	
	@Column(name="Periodo")
	private String period;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQtdhalf() {
		return qtdhalf;
	}

	public void setQtdhalf(String qtdhalf) {
		this.qtdhalf = qtdhalf;
	}

	public String getWorkload() {
		return workload;
	}

	public void setWorkload(String workload) {
		this.workload = workload;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
	
}
