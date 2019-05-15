package Tabelas;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class TabelaCurso {

	private final SimpleLongProperty id;
	private final SimpleStringProperty nome;
	private final SimpleStringProperty periodo;
	private final SimpleStringProperty semestre;
	private final SimpleStringProperty tempo;
	
	
	public TabelaCurso(Long id, String nome, String periodo,
			String semestre, String tempo) {
		super();
		this.id = new SimpleLongProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.periodo = new SimpleStringProperty(periodo);
		this.semestre = new SimpleStringProperty(semestre);
		this.tempo = new SimpleStringProperty(tempo);
	}


	public Long getId() {
		return id.get();
	}


	public String getNome() {
		return nome.get();
	}


	public String getPeriodo() {
		return periodo.get();
	}


	public String getSemestre() {
		return semestre.get();
	}


	public String getTempo() {
		return tempo.get();
	}
	
	
	
}
